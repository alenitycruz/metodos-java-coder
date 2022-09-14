package com.coder;

import com.coder.Data;

public class DataTeste {
    public static void main(String[] args) {
        Data data1 = new Data();
        data1.dia = 27;
        data1.mes = 8;
        data1.ano = 1987;

        Data data2 = new Data();
        data2.dia = 15;
        data2.mes = 8;
        data2.ano = 2022;



        System.out.println("Eu nasci em " + data1.dia + "/" + data1.mes + "/" + data1.ano);
        System.out.println("A data de hoje e " + data2.dia + "/" + data2.mes + "/" + data2.ano);

        data1.obterDataFormatada();
        System.out.println(data1.dataFormatada());
        data2.obterDataFormatada();
        System.out.println(data2.dataFormatada());
        System.out.println(data1.outroDeData());
        System.out.println(data2.outroDeData());

        Data data3 = new Data(1,1, 1970);
        data3.obterDataFormatada();
        System.out.println(data3.dataFormatada());
        data3.ano = 2022;
        data3.obterDataFormatada();
        System.out.println(data3.dataFormatada());
    }
}
