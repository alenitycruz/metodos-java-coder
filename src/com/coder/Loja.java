package com.coder;

public class Loja {

    boolean feriado;
    double preco = 0;
    static double desconto = 0.25;

    public Loja(double precoInicial) {
        preco = precoInicial;
        feriado = false;
    }

    static double valorFinal(boolean feriado, double preco){
        if (feriado == true) {
            desconto = 0.3;
            preco = preco - (preco * desconto);
            return preco;
        } else{
            preco = preco - (preco * desconto);
            return preco;
        }
    }
}
