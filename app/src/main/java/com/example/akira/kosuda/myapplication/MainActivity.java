package com.example.akira.kosuda.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

// TODO: 2018/04/08  メールの使えるデバイスでの動作チェック 

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnPickUp = (Button) findViewById(R.id.button1);
        btnPickUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,PickUpActivity.class);
                startActivity(intent);
            }
        });

        Button btnNoDinner = (Button) findViewById(R.id.button2);
        btnNoDinner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,NoDinnerActivity.class);
                startActivity(intent);
            }
        });
    }
}
