package com.example.a15squaresgame;

public class SquareController {
private SquareView SV;
private SquareModel SM;

public SquareController(SquareView initSV){
    SV = initSV;
    SM = SV.getSquareModel();
}
}
