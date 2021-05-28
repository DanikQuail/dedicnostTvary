package com.company.logic;

public class Shape {
    protected float a;
    protected float b;
    protected float c;
    protected float vyska;
    protected float polomer;

    public Shape(float a, float b, float c, float vyska, float polomer) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.vyska = vyska;
        this.polomer = polomer;
    }

    public float vypocetObvodu() {
        return -1;
    }
    public float vypocetObsahu() {
        return -1;
    }
}
