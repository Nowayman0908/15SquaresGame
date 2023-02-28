package com.example.a15squaresgame;
import android.content.Context;
import android.graphics.Canvas;
//author@ Ayden Semerak
//date@ 02/27/2023

import android.util.AttributeSet;
import android.view.SurfaceView;
import android.widget.Button;

public class SquareView extends SurfaceView {

    private final SquareModel SM;

    public SquareView(Context context, AttributeSet attrs){
        super(context,attrs);
        SM = new SquareModel();
        setWillNotDraw(false);
        //borderSquareCol.setColor(0xFF32CD32); //Lime Green
    }
    @Override
    public void onDraw(Canvas canvas) {

    }

    public void addButtons(int p, Button button){
        SM.buttonArr[p] = button;
    }

    public void setOnClick(SquareController SC){
        //Sets all of the buttons to be "listened" to when clicked.
        for(int f = 0; f < SM.totalNumSquare+1; f++){
            SM.buttonArr[f].setOnClickListener(SC);
        }
    }

    public SquareModel getSquareModel()
    {
        return SM;
    }
}

