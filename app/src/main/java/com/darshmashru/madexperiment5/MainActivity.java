package com.darshmashru.madexperiment5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void goToCompanyWebPage(View view) {
        Intent intent = new Intent(MainActivity.this, CompanyWebPage.class);
        startActivity(intent);
    }
}
// TODO: The first activity is a Welcome Screen, that provides brief information about any website.
//  A button onClick would open the second activity which displays a WebView loaded with the aforementioned website.
//  The second activity must handle Telephone Links (tel:) and Email Links (mailto:), by opening the
//  “Phone” App and “Mail” App respectively.
//  The second activity must also include a back button to return to the first activity.