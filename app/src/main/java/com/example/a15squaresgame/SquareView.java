package com.example.a15squaresgame;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.SurfaceView;
import android.widget.Button;

public class SquareView extends SurfaceView {
    Paint borderSquareCol = new Paint();
    public static final float borderWidth = 1200.0f;
    public static final float top = 1200.0f;
    public static final float bottom = 120.0f;
    public static final float borderLeft = 1200.0f;

    private SquareModel SM;

    public SquareView(Context context, AttributeSet attrs){
        super(context,attrs);
        SM = new SquareModel();
        setWillNotDraw(false);
        borderSquareCol.setColor(0xFF32CD32); //Lime Green
    }
    @Override
    public void onDraw(Canvas canvas) {
        //Worry about later, the button is all that matters at the moment.
        //canvas.drawRect(borderLeft,top,borderLeft + borderWidth, bottom, borderSquareCol);
        //canvas.drawRect();
    }

    public void addButtons(int p, Button button){
        SM.buttonArr[p] = button;
    }

    public void setOnClick(SquareController SC){
        for(int f = 0; f < SM.totalNumSquare; f++){
            SM.buttonArr[f].setOnClickListener(SC);
        }
    }

    public SquareModel getSquareModel()
    {
        return SM;
    }
}

