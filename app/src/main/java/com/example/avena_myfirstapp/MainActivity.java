package com.example.avena_myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView hello;
    TextView name;
    TextView contact;
    TextView email;
    Button myButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       hello = (TextView) findViewById(R.id.txtView1);
       name = (TextView) findViewById(R.id.txtView2);
       contact = (TextView) findViewById(R.id.txtView3);
       email = (TextView) findViewById(R.id.txtView4);
       myButton = (Button) findViewById(R.id.btn1);

        //hello.setText("Hello Phil!");

        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hello.setText("Hello Phil!");

            }
        });

    }
}