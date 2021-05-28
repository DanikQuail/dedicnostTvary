package com.company.logic;

public class Rectangle extends Shape {

    //hodnoty
    public Rectangle(float a, float b){
        super(a, b, 0, 0, 0);
    }
    @Override
    public float vypocetObvodu() {
        return a * b;
    }

    @Override
    public float vypocetObsahu() {
        return 2 * (a + b);
    }
}
