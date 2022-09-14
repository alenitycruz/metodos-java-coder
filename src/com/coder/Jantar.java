package com.coder;

public class Jantar {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Alessandra", 50.0);
        Pessoa p2 = new Pessoa("Alessandra");
        Comida c1 = new Comida("sopa", 2.0);
        Comida c2 = new Comida();

        p1.comer(c1);
        p1.comer(c2);


        System.out.println(p1.apresentar());
        System.out.println(p2.apresentar());
    }
}
