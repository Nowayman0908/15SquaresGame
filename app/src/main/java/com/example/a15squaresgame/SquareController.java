package com.example.a15squaresgame;

import android.util.Log;
import android.widget.SeekBar;

import java.util.Random;

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
    for(int j = 0; j < SM.setNumSquare; j++){
        for(int y = 0; j < SM.setNumSquare; y++){
            SM.randomNum = SM.random.nextInt(SM.totalNumSquare);
            if(randomCheck()) {
                SM.SquareNumOrder[j][y] = SM.randomNum;
            }
        }
    }

}

public boolean randomCheck(){
    //Checks the Array List randomCheck the random number has already been assigned to a square.
    if(SM.randomCheck.contains(SM.randomNum)){
        SM.randomNum = SM.random.nextInt(SM.totalNumSquare);
        //Recalls the method and generates a new random number if the number is in randomCheck.
        randomCheck();
        return false;
    }
    else{
        SM.randomCheck.add(SM.randomNum);
        return true;
    }
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
