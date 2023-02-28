package com.example.a15squaresgame;

import android.view.View;

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

public void squareFlip(int index){
    //Rewrite to check for the "16" square next to it.
    int placeHolder;
    //If the empty button is to the right of the clicked button.
    if(index < SM.totalNumSquare - 2 && String.valueOf(SM.squareNumOrder[index + 1]).equals("16")) {
        placeHolder = SM.squareNumOrder[index];
        SM.squareNumOrder[index] = SM.squareNumOrder[index + 1];
        SM.squareNumOrder[index + 1] = placeHolder;
    }
    //If the empty button is to the left of the clicked button.
    else if(index > 0 && String.valueOf(SM.squareNumOrder[index - 1]).equals("16")){
        placeHolder = SM.squareNumOrder[index];
        SM.squareNumOrder[index] = SM.squareNumOrder[index - 1];
        SM.squareNumOrder[index - 1] = placeHolder;
    }
    //If the empty button is above the clicked button.
    else if(index <= 11 && String.valueOf(SM.squareNumOrder[index + 4]).equals("16")){
        placeHolder = SM.squareNumOrder[index];
        SM.squareNumOrder[index] = SM.squareNumOrder[index + 4];
        SM.squareNumOrder[index + 4] = placeHolder;
    }
    //If the empty button is below the clicked button.
    else if(index >= 4 && String.valueOf(SM.squareNumOrder[index - 4]).equals("16")){
        placeHolder = SM.squareNumOrder[index];
        SM.squareNumOrder[index] = SM.squareNumOrder[index - 4];
        SM.squareNumOrder[index - 4] = placeHolder;
    }
    rewriteButtons();
}
public void rewriteButtons() {
    for (int s = 0; s < SM.totalNumSquare; s++) {
        SM.buttonText[s] = SM.buttonArr[s];
        if (!String.valueOf(SM.squareNumOrder[s]).equals("16")) {
            SM.buttonText[s].setText(String.valueOf(SM.squareNumOrder[s]));
        } else {
            //Used to set the "empty" Square which should be moved.
            SM.buttonText[s].setText("");
        }
    }
}

    @Override
    public void onClick(View Button) {
    //The reset buttons functionality to reset the Squares to a random order.
        if(Button == SM.buttonArr[16]){
            SM.squareNumOrder = new int[SM.totalNumSquare];
            randomizeSquares();
            rewriteButtons();
        }
        for(int i = 0; i < SM.totalNumSquare; i++){
            if(Button == SM.buttonArr[i]){
                squareFlip(i);
                SV.invalidate();
            }
        }
    }
}
