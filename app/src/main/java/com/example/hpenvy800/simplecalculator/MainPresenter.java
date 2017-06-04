package com.example.hpenvy800.simplecalculator;

/**
 * Created by HP ENVY800 on 4/6/2560.
 */

public class MainPresenter {
    MainActivity activity;

    public MainPresenter(MainActivity activity){
        this.activity = activity;
    }

    public void numberPress(int numPressed){
        if (activity.display.getText().equals("")){
            activity.display.setText(numPressed);
        }   else{
            activity.display.append(Integer.toString(numPressed));
        }
    }
}
