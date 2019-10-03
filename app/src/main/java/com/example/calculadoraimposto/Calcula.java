package com.example.calculadoraimposto;

public class Calcula {

    private final Tributos tributo;
    private final double valor;

    public Calcula(Tributos tributo, double valor){
        this.tributo = tributo;
        this.valor = valor;
    }

    public double calculaImposto(){
        double valorImposto = 0.0;
        Imposto imposto = this.tributo.getImposto();
        valorImposto = imposto.calculaImposto(valor);
        return valorImposto;
    }


}
