package com.coder;

public class Produto {
    String nome;
    double preco;
    static double desconto = 0.25;

    public Produto() {
    }

    public Produto(String nomeInicial, double precoInicial) {
        nome = nomeInicial;
        preco = precoInicial;
    }

    public double valorFinal(){
        return preco * (1 - desconto);
    }

}
