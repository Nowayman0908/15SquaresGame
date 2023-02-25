package com.example.a15squaresgame;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class SquareModel {
    //Vocabulary note: Square and Button are the same term in this program as they essentially are the same thing in this program.
    public int setNumSquare = 4; //Number of Squares per row.
    public int totalNumSquare = setNumSquare * setNumSquare; //Total number of Squares, excluding the reset button.
    public int[] corrSquareNumOrder = new int[totalNumSquare]; //An array of the correct Square Order.
    public int[] squareNumOrder = new int[totalNumSquare]; //An array of the random Square order.
    public int randomNum; //The random number used to set a random Square.
    public boolean[] correctSquare = new boolean[totalNumSquare]; //Used to know if a square is in the correct order.
    Random random = new Random(); //The random number generated.
    public Button [] buttonArr = new Button[totalNumSquare+1]; //The array of buttons, including the reset button.
    public TextView [] buttonText = new TextView[totalNumSquare]; //The array of all button text.

}
