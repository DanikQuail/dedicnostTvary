package com.company.logic;

public class Square extends Shape {

    //hodnoty
    public Square(float a){
        super(a, 0, 0, 0, 0);
    }

    @Override
    public float vypocetObsahu() {
        return a * a;
    }

    @Override
    public float vypocetObvodu() {
        return a * 4;
    }
}
