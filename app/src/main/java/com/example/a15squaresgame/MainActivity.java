package com.example.a15squaresgame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //SquareView SV = findViewById(R.id.squareview);
        //SquareController SC = new SquareController();

        SeekBar numSquaresBar = findViewById(R.id.numSquareSeekBar);
        //numSquaresBar.setOnSeekBarChangeListener(SC);
    }
}