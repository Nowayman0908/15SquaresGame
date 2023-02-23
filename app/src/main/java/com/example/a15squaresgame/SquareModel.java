package com.example.a15squaresgame;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class SquareModel {
    public int setNumSquare = 4;
    public int totalNumSquare = setNumSquare * setNumSquare;
    public int[] corrSquareNumOrder = new int[totalNumSquare];
    public int[] squareNumOrder = new int[totalNumSquare];
    public ArrayList randomCheck = new ArrayList();
    public int randomNum;
    public boolean[] correctSquare = new boolean[totalNumSquare];
    Random random = new Random();
    public Button [] buttonArr = new Button[totalNumSquare+1];
    public TextView [] buttonText = new TextView[totalNumSquare];
    public TextView buttonChange;

}
