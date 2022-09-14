package com.coder;

public class AreaCircTeste {

    public static void main(String[] args) {

        AreaCirc a1 = new AreaCirc(5.6);
        //a1.pi = 5; não é ideal

        AreaCirc a2 = new AreaCirc(5.6);
        //a2.pi = 0; //não é ideal

        //AreaCirc.pi = 3.1415; // o certo

        System.out.println(AreaCirc.area(10));
        System.out.println(a2.area());
        System.out.println(AreaCirc.PI);
    }
}
