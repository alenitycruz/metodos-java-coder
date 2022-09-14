package com.coder;

public class AreaCirc {

    static final double PI = 3.1415;
    double raio;

    public AreaCirc(double raioInicial) {
        raio = raioInicial;
    }

    double area(){
        return PI * Math.pow(raio,2);

    }

    static double area(double raio){
        return PI * Math.pow(raio,2);
    }
}
