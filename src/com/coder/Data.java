package com.coder;

public class Data {

    int dia;
    int mes;
    int ano;

    public Data() {
        //dia = 1;
        //mes = 1;
        //ano = 1990;
        this(1,1,1990);
    }

    public Data(int diaInicial, int mesInicial, int anoInicial) {
        this.dia = diaInicial;
        this.mes = mesInicial;
        this.ano = anoInicial;
    }

    public void obterDataFormatada() {
        System.out.println(dia + "/" + mes + "/" + ano);
    }

    public String dataFormatada() {

        String dataDisposta = Integer.toString(dia) + "/" + Integer.toString(mes) +  "/" + Integer.toString(ano);

        return dataDisposta;
    }

    public String outroDeData(){
        String formato = "%d/%d/%d";
        return String.format(formato, dia, mes, ano);
    }
}
