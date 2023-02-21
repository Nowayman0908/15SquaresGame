package com.example.a15squaresgame;
import java.util.ArrayList;
import java.util.Random;

public class SquareModel {
    public int setNumSquare = 4;
    public int totalNumSquare = setNumSquare * setNumSquare;
    public int[] corrSquareNumOrder = new int[totalNumSquare];
    public int[][] SquareNumOrder = new int[setNumSquare][setNumSquare];

    public ArrayList randomCheck = new ArrayList();
    public int randomNum;
    Random random = new Random();

}
