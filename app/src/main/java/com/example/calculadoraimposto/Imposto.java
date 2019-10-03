package com.example.calculadoraimposto;

public enum Imposto implements CalculaImposto{

    ISS{@Override
    public double calculaImposto(double valor) {
        return valor * 0.3;
    }},
    ICMS{@Override
    public double calculaImposto(double valor) {
        return valor * 0.2;
    }};


}
