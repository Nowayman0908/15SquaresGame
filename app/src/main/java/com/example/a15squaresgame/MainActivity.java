//author@ Ayden Semerak
//date@ 02/27/2023

package com.example.a15squaresgame;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Finds the manually added SquareView in the activity xml code.
        SquareView SV = findViewById(R.id.squareview);
        SquareController SC = new SquareController(SV);

        //This is disgusting,there must be a better way but I can not think of it.
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
        //The reset button is added as well.
        SV.addButtons(16,findViewById(R.id.button17));

        //Sets the Square Controller to "listen" for clicks.
        SV.setOnClick(SC);
        //Checks the order of the Squares.
        SC.orderCheck();
        //Writes the Square text.
        SC.rewriteButtons();
    }
}