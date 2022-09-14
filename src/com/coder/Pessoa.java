package com.coder;

public class Pessoa {

    String nome;
    double peso;

    public Pessoa(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    public Pessoa(String nome) {
        this.nome = nome;

    }

    void comer(Comida comida){
        if (comida != null) {
            peso += comida.peso;
        }
    }

    String apresentar(){
        return "Ola, eu sou " + nome + " e tenho "+ peso+ "Kgs";
    }
}
