package com.example.androidlab12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button bAddBike, bShowImages;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        bAddBike = (Button) findViewById(R.id.bAddBike);
        bAddBike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showAddBike();
            }
        });

        // Button: show foods
        //
        bShowImages = (Button) findViewById(R.id.bShowBikes);
        bShowImages.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showBike();
            }
        });

    }

    private void showAddBike(){
        Intent intent = new Intent(MainActivity.this, AddBike.class);
        MainActivity.this.startActivity(intent);
    }

    private void showBike(){
        Intent intent = new Intent(MainActivity.this, ShowBikes.class);
        MainActivity.this.startActivity(intent);
    }
}