package com.conta.model;

import com.conta.exception.SaldoInsuficienteException;
import com.conta.exception.ValorInvalidoException;

public class ContaCorrente extends Conta {

    private double limite;

    public ContaCorrente(String numero, String titular, double limite) {
        super(numero, titular);
        this.limite = limite;
    }

    @Override
    public void sacar(double valor) {
        if (valor <= 0) {
            throw new ValorInvalidoException("Valor de saque deve ser maior que zero.");
        }

        if (this.saldo + this.limite < valor) {
            throw new SaldoInsuficienteException("Saldo insuficiente para realizar o saque, mesmo considerando o limite.");
        }
        this.saldo -= valor;
    }

    public double getLimite() {
            return limite;
    }
    
}
