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
    Random random = new Random();
    public Button [] buttonArr = new Button[totalNumSquare];
    public TextView [] buttonText = new TextView[totalNumSquare];

}
