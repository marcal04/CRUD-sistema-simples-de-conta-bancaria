package com.conta;

import com.conta.model.Conta;
import com.conta.model.ContaCorrente;
import com.conta.model.ContaPoupanca;

public class Main {

    public static void main(String[] args) {

        Conta conta1 = new ContaCorrente("001", "Marcal", 500.0);
        Conta conta2 = new ContaPoupanca("002","Guilherme");

        conta1.depositar(1000);
        conta1.transferir(300, conta2);

        conta2.depositar(200);
        conta2.sacar(100);

        System.out.println(conta1);
        System.out.println(conta2);
    }
}