package sg.edu.rp.c346.day4.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CollectionActivity extends AppCompatActivity {
    TextView tnus;
    TextView tsmu;
    TextView tntu;
    TextView tsutd;
    TextView tsit;
    TextView tsuss;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collection);
        tnus = findViewById(R.id.tnus);
        tsmu = findViewById(R.id.tsmu);
        tntu = findViewById(R.id.tntu);
        tsutd = findViewById(R.id.tsutd);
        tsit = findViewById(R.id.tsit);
        tsuss = findViewById(R.id.tsuss);
        tnus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CollectionActivity.this, DetailsActivity.class);
                intent.putExtra("Name", "National University of Singapore");
                intent.putExtra("Rank", "87");
                intent.putExtra("Type", "Non-profit");
                intent.putExtra("Funding", "Public-private partnership");
                intent.putExtra("Rate", "5%");
                intent.putExtra("Enrollment", "-");
                intent.putExtra("Status", "Public");
                intent.putExtra("Degree", "Doctorate");
                intent.putExtra("Contact", "+65 6516 6666");
                intent.putExtra("Address", "21 Lower Kent Ridge Roa, Singapore 119077");
                intent.putExtra("Website", "https://www.nus.edu.sg/");
                intent.putExtra("Geo", "geo:1.2966860033808236, 103.77649682897287");
                startActivity(intent);

            }
        });
        tsmu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CollectionActivity.this, DetailsActivity.class);
                intent.putExtra("Name", "Singapore Management University");
                intent.putExtra("Rank", "771");
                intent.putExtra("Type", "Non-profit");
                intent.putExtra("Funding", "Public-private partnership");
                intent.putExtra("Rate", "7%");
                intent.putExtra("Enrollment", "-");
                intent.putExtra("Status", "Public");
                intent.putExtra("Degree", "Bachelor");
                intent.putExtra("Address", "81 Victoria St, Singapore 188065");
                intent.putExtra("Contact", "+65 6828 0100");
                intent.putExtra("Website", "https://www.smu.edu.sg/");
                intent.putExtra("Geo", "geo:1.2965077184050793, 103.85027236071464");
                startActivity(intent);
            }
        });
        tntu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CollectionActivity.this, DetailsActivity.class);
                intent.putExtra("Name", "Nanyang Technological University");
                intent.putExtra("Rank", "172");
                intent.putExtra("Type", "Non-profit");
                intent.putExtra("Funding", "Public-private partnership");
                intent.putExtra("Rate", "35%");
                intent.putExtra("Enrollment", "-");
                intent.putExtra("Status", "Public");
                intent.putExtra("Degree", "Doctorate");
                intent.putExtra("Address", "50 Nanyang Ave, Singapore 639798");
                intent.putExtra("Contact", "+65 6791 1744");
                intent.putExtra("Website", "https://www.ntu.edu.sg/");
                intent.putExtra("Geo", "geo:1.3444949233819194, 103.68048512921564");
                startActivity(intent);
            }
        });
        tsutd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CollectionActivity.this, DetailsActivity.class);
                intent.putExtra("Name", "Singapore University of Technology and Design");
                intent.putExtra("Rank", "2346");
                intent.putExtra("Type", "Non-profit");
                intent.putExtra("Funding", "Public-private partnership");
                intent.putExtra("Rate", "7%");
                intent.putExtra("Enrollment", "-");
                intent.putExtra("Status", "Public");
                intent.putExtra("Degree", "-");
                intent.putExtra("Address", "8 Somapah Road, Singapore 487372");
                intent.putExtra("Contact", "+65 6303 6600");
                intent.putExtra("Website", "https://www.sutd.edu.sg/");
                intent.putExtra("Geo", "geo:1.3414309097715338, 103.96383832788659");
                startActivity(intent);
            }
        });
        tsit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CollectionActivity.this, DetailsActivity.class);
                intent.putExtra("Name", "Singapore Institute of Technology");
                intent.putExtra("Rank", "5068");
                intent.putExtra("Type", "Non-profit");
                intent.putExtra("Funding", "Public-private partnership");
                intent.putExtra("Enrollment", "2,500");
                intent.putExtra("Rate", "-");
                intent.putExtra("Status", "Public");
                intent.putExtra("Degree", "-");
                intent.putExtra("Address", "10 Dover Drive, Singapore 138683");
                intent.putExtra("Contact", "+65 6592 1136");
                intent.putExtra("Website", "https://sitlearn.singaporetech.edu.sg/");
                intent.putExtra("Geo", "geo:1.3007205726308233, 103.78066957021514");
                startActivity(intent);
            }
        });
        tsuss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CollectionActivity.this, DetailsActivity.class);
                intent.putExtra("Name", "Singapore University of Social Sciences");
                intent.putExtra("Rank", "3445");
                intent.putExtra("Type", "Non-profit");
                intent.putExtra("Funding", "Public-private partnership");
                intent.putExtra("Enrollment", "12,500");
                intent.putExtra("Rate", "-");
                intent.putExtra("Status", "Public");
                intent.putExtra("Degree", "Bachelor");
                intent.putExtra("Address", "463 Clementi Rd, Singapore 599494");
                intent.putExtra("Contact", "+65 6248 9777");
                intent.putExtra("Website", "https://www.suss.edu.sg/");
                intent.putExtra("Geo", "geo:1.3288744623399387, 103.77589481254364");
                startActivity(intent);
            }
        });


    }

}