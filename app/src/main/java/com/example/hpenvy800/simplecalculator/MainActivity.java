package com.example.hpenvy800.simplecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button numOne;
    Button numTwo;
    Button numThree;
    Button numFour;
    Button numFive;
    Button numSix;
    Button numSeven;
    Button numEight;
    Button numNine;
    Button numZero;
    Button optAdd;
    Button optSubtract;
    Button optMultiply;
    Button optDivide;
    TextView display;
    MainPresenter calc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        display = (TextView) findViewById(R.id.displayTextView);
        numOne = (Button) findViewById(R.id.button1);
        numTwo = (Button) findViewById(R.id.button2);
        numThree = (Button) findViewById(R.id.button3);
        numFour = (Button) findViewById(R.id.button4);
        numFive = (Button) findViewById(R.id.button5);
        numSix = (Button) findViewById(R.id.button6);
        numSeven = (Button) findViewById(R.id.button7);
        numEight = (Button) findViewById(R.id.button8);
        numNine = (Button) findViewById(R.id.button9);
        numZero = (Button) findViewById(R.id.button0);
        optAdd = (Button) findViewById(R.id.addButton);
        optSubtract = (Button) findViewById(R.id.subtractButton);
        optMultiply = (Button) findViewById(R.id.multiplyButton);
        optDivide = (Button) findViewById(R.id.divideButton);
        calc = new MainPresenter(this);

        numOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc.numberPress(1);
            }
        });

        numTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc.numberPress(2);
            }
        });
        numThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc.numberPress(3);
            }
        });
        numFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc.numberPress(4);
            }
        });
    }
}
