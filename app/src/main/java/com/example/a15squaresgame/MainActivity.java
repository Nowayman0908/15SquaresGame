package com.example.a15squaresgame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SquareView SV = findViewById(R.id.squareview);
        SquareController SC = new SquareController(SV);
        SquareModel SM = SV.getSquareModel();

        //Spain without the s.
        SV.addButtons(0,findViewById(R.id.button1));
        SV.addButtons(1,findViewById(R.id.button2));
        SV.addButtons(2,findViewById(R.id.button3));
        SV.addButtons(3,findViewById(R.id.button4));
        SV.addButtons(4,findViewById(R.id.button5));
        SV.addButtons(5,findViewById(R.id.button6));
        SV.addButtons(6,findViewById(R.id.button7));
        SV.addButtons(7,findViewById(R.id.button8));
        SV.addButtons(8,findViewById(R.id.button9));
        SV.addButtons(9,findViewById(R.id.button10));
        SV.addButtons(10,findViewById(R.id.button11));
        SV.addButtons(11,findViewById(R.id.button12));
        SV.addButtons(12,findViewById(R.id.button13));
        SV.addButtons(13,findViewById(R.id.button14));
        SV.addButtons(14,findViewById(R.id.button15));
        SV.addButtons(15,findViewById(R.id.button16));
        SV.addButtons(16,findViewById(R.id.button17));
        SV.setOnClick(SC);
        SC.orderCheck();
        SC.rewriteButtons();
    }
}