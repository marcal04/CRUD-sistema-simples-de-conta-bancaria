package com.conta.model;

import com.conta.exception.SaldoInsuficienteException;
import com.conta.exception.ValorInvalidoException;

public class Conta {

    private String numero;
    private String titular;
    protected double saldo;

    public Conta(String numero, String titular) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = 0.0;
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            throw new ValorInvalidoException("Valor de depósito deve ser maior que zero.");
        }

        this.saldo += valor;
    }

    public void sacar(double valor) {
        if (valor <= 0) {
            throw new ValorInvalidoException("Valor de saque deve ser maior que zero.");

        }

        if (this.saldo < valor) {
            throw new SaldoInsuficienteException("Saldo insuficiente para realizar o saque.");
        }

        this.saldo -= valor;

    }

    public void transferir(double valor, Conta contaDestino) {
        if (contaDestino == null) {
            throw new IllegalArgumentException("Conta de destino não pode ser nula.");
        }

        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "numero='" + numero + '\'' +
                ", titular='" + titular + '\'' +
                ", saldo=" + saldo +
                '}';
    }

}
