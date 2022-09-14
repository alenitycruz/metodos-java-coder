package com.coder;


public class ValorVsReferencia {
    public static void main(String[] args) {
        double a = 2;
        double b = a; //atribuicao por valor

        a++;
        b--;

        System.out.println(a + " "+ b);

        Data d1 = new Data(1, 1, 1987);
        Data d2 = d1; //atribuicao por referencia(Objeto)

        d1.dia = 27;
        d2.mes = 8;

        d2.obterDataFormatada();
        System.out.println(d1.outroDeData());

        voltarParaDataInicial(d1);

        d2.obterDataFormatada();
        System.out.println(d1.outroDeData());

    }

    static void voltarParaDataInicial(Data d){
        d.dia = 1;
        d.mes = 1;
        d.ano = 1987;
    }
}
