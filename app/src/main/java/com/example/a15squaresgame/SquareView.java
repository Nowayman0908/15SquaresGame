package com.example.a15squaresgame;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.SurfaceView;

public class SquareView extends SurfaceView {
    Paint borderSquareCol = new Paint();
    public static final float borderWidth = 1200.0f;
    public static final float top = 1200.0f;
    public static final float bottom = 1200.0f;
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
        canvas.drawRect(borderLeft,top,borderLeft + borderWidth, bottom, borderSquareCol);
    }

    public SquareModel getSquareModel()
    {
        return SM;
    }
}

