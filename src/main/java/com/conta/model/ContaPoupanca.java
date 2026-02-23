package com.conta.model;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(String numero, String titular) {
        super(numero, titular);
    }

    public void renderJuros(double taxaPercentual) {
        if (taxaPercentual > 0 ) {
            this.saldo += this.saldo * (taxaPercentual / 100);
        }
    }
}
