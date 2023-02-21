package com.example.a15squaresgame;

import android.util.Log;
import android.widget.SeekBar;

public class SquareController implements SeekBar.OnSeekBarChangeListener{
private SquareView SV;
private SquareModel SM;

public SquareController(SquareView initSV){
    SV = initSV;
    SM = SV.getSquareModel();
    //Initializes the correct base to compare the squares to.
    for(int i = 0; i < SM.totalNumSquare; i++){
        SM.corrSquareNumOrder[i] = i;
    }
    //Initializes the random Square Order.
    //Note: Add randomization of Square Order.
    Math.random();
}

    @Override
    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
        SM.setNumSquare = i;
        SV.invalidate();
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}
