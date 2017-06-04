package com.example.hpenvy800.simplecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button numOne;
    Button numTwo;
    Button numThree;
    Button numFour;
    Button numFive;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView display = (TextView) findViewById(R.id.displayTextView);
        numOne = (Button) findViewById(R.id.button1);
        numTwo = (Button) findViewById(R.id.button1);
        numThree = (Button) findViewById(R.id.button1);
        numFour = (Button) findViewById(R.id.button1);
        numFive = (Button) findViewById(R.id.button1);


    }
}
