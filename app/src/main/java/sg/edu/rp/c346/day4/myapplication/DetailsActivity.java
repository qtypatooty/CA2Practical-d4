package sg.edu.rp.c346.day4.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;


import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {
    TextView websites;
    TextView details;
    TextView addresses;
    TextView contacts;
    Button goback;
    String wordClicked = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        details = findViewById(R.id.details);
        addresses = findViewById(R.id.addresses);
        contacts = findViewById(R.id.contacts);
        websites= findViewById(R.id.websites);
        goback = findViewById(R.id.goback);
        Intent intentReceived = getIntent();
        registerForContextMenu(details);
        registerForContextMenu(contacts);
        registerForContextMenu(addresses);
        registerForContextMenu(websites);
        String name = intentReceived.getStringExtra("Name");
        String rank = intentReceived.getStringExtra("Rank");
        String type = intentReceived.getStringExtra("Type");
        String funding = intentReceived.getStringExtra("Funding");
        String rate = intentReceived.getStringExtra("Rate");
        String status = intentReceived.getStringExtra("Status");
        String degree = intentReceived.getStringExtra("Degree");
        String enrollment = intentReceived.getStringExtra("Enrollment");
        String address = intentReceived.getStringExtra("Address");
        String contact = intentReceived.getStringExtra("Contact");
        String website = intentReceived.getStringExtra("Website");
        String location = intentReceived.getStringExtra("Location");
        String geo = intentReceived.getStringExtra("Geo");

        details.setText(" Name:          " + name + "\n Rank:          " + rank + " \n Type:          " + type + "\n Funding:          " + funding + "\n Acceptance Rate:          " + rate + "\n Enrollment:          " + enrollment
                + "\n Status:          " + status + "\n Degree:          " + degree +  "\n Contact:          " + contact );
        addresses.setText(" Address:          " + address );
        contacts.setText(" Contact:          " + contact );
        websites.setText(" Website:          " + website );
        goback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        addresses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri gmmIntentUri = Uri.parse(geo);
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);
            }
        });
        contacts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL,Uri.parse("tel:"+contact));
                startActivity(intent);
            }
        });

    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View view,
                                    ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, view, menuInfo);
        getMenuInflater().inflate(R.menu.menu, menu);
        menu.setHeaderTitle("Change Font Size");


    }

    @Override

    public boolean onContextItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.Big) {
            details.setTextSize(22);
            contacts.setTextSize(22);
            addresses.setTextSize(22);
            websites.setTextSize(22);
        } else if (id == R.id.Small) {
            details.setTextSize(12);
            contacts.setTextSize(12);
            addresses.setTextSize(12);
            websites.setTextSize(12);
        } else{
            details.setTextSize(14);
            contacts.setTextSize(14);
            addresses.setTextSize(14);
            websites.setTextSize(14);
        }
        return super.onContextItemSelected(item);
    }


}
