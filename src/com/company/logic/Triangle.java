package com.company.logic;

public class Triangle extends Shape{

    //hodnoty
    public Triangle (float a, float b, float c, float vyska){
        super(a, b, c, vyska, 0);
    }
    @Override
    public float vypocetObvodu() {
        return a + b + c;
    }

    @Override
    public float vypocetObsahu() {
        return (vyska * c) / 2;
    }
}
