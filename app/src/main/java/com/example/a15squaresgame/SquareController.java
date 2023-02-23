package com.example.a15squaresgame;

import android.util.Log;
import android.view.View;
import android.widget.SeekBar;

import java.util.Random;

public class SquareController implements  View.OnClickListener{
private SquareView SV;
private SquareModel SM;

public SquareController(SquareView initSV){
    SV = initSV;
    SM = SV.getSquareModel();
    //Initializes the correct base to compare the squares to.
    for(int i = 1; i < SM.totalNumSquare; i++){
        SM.corrSquareNumOrder[i] = i;
    }
    randomizeSquares();
    //Initializes all the buttons as if they were not correct.
    for(int b = 0; b < SM.totalNumSquare; b++){
        SM.correctSquare[b] = false;
    }
}

public void randomCheck(){
    //Checks the Array List randomCheck the random number has already been assigned to a square.
        while(arrCheck(SM.randomNum) || SM.randomNum == 0) {
            SM.randomNum = SM.random.nextInt(SM.totalNumSquare);
        }
}

public boolean arrCheck(int num){
    for(int t = 0; t < SM.totalNumSquare; t++){
        if(SM.squareNumOrder[t] == num){
            return true;
        }
    }
    return false;
}
public void randomizeSquares() {
    //Initializes the random Square Order.
    for (int j = 0; j < SM.totalNumSquare; j++) {
        //Note, the number 16 will represent the empty square.
        SM.randomNum = SM.random.nextInt(SM.totalNumSquare + 1);
        randomCheck();
        SM.squareNumOrder[j] = SM.randomNum;
    }
}

public void orderCheck(){
    for(int u = 0; u < SM.totalNumSquare;u++){
        if(SM.corrSquareNumOrder[u] == SM.squareNumOrder[u]){
            SM.correctSquare[u] = true;
        }
        else{
            SM.correctSquare[u] = false;
        }
    }
}

public void squareFlip(int index, int indexSwitch){
    if(index == indexSwitch+1 || index == indexSwitch-1 || index == indexSwitch + 4 || index ==indexSwitch - 4) {
        int placeHolder = -420;
        placeHolder = SM.squareNumOrder[index];
        SM.squareNumOrder[index] = SM.squareNumOrder[indexSwitch];
        SM.squareNumOrder[indexSwitch] = placeHolder;
    }
}
public void rewriteButtons() {
    for (int s = 0; s < SM.totalNumSquare; s++) {
        SM.buttonText[s] = SM.buttonArr[s];
        if (!String.valueOf(SM.squareNumOrder[s]).equals("16")) {
            SM.buttonText[s].setText(String.valueOf(SM.squareNumOrder[s]));
        } else {
            SM.buttonText[s].setText("");
        }
    }
}

    @Override
    public void onClick(View Button) {
        if(Button == SM.buttonArr[16]){
            SM.squareNumOrder = new int[SM.totalNumSquare];
            randomizeSquares();
            rewriteButtons();
        }
    }
}
