package com.coder;

public class ProdutoTeste {
    public static void main(String[] args) {
        var p1 = new Produto();
        p1.nome = "Notebook";
        p1.preco = 1600.0;
        Produto.desconto = 0.25;

        Produto p2 = new Produto();
        p2.nome = "Celular";
        p2.preco = 800.0;
        Produto.desconto = 0.29;

        Produto p3 = new Produto("Tablet", 700.0);

        System.out.println(p1.nome);
        System.out.println(p2.nome);

        double precoFinal1 = p1.preco * (1 - Produto.desconto);
        double precoFinal2 = p2.preco * (1 - Produto.desconto);
        double precoFinal3 = p3.preco * (1 - Produto.desconto);
        double mediaCarrinho = (precoFinal1+precoFinal2+precoFinal3)/3;

        System.out.printf("Media de compras: R$ %.2f", mediaCarrinho);
        System.out.println("\nO preco final e: " + (p1.valorFinal() + p2.valorFinal())/2);

    }
}
