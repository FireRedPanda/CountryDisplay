package com.example.a1439510.countrydisplay;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openMap(View view){
        Intent map = new Intent(Intent.ACTION_VIEW);
        map.setData(Uri.parse("geo:0,0?q="+ getString(R.string.country)));
        if(map.resolveActivity(getPackageManager()) != null) {
            startActivity(map);
        }
    }

}
