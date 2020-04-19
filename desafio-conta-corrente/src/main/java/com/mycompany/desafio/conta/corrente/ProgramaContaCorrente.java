/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.desafio.conta.corrente;

/**
 *
 * @author manoe
 */
public class ProgramaContaCorrente {
    
    public static void main(String[] args) {
        ContaCorrente conta1 = new ContaCorrente("Zezé", 0.0);
        conta1.depositar(20.0, 12, 2, 2020);
        conta1.depositar(28.5, 16, 2, 2020);
        conta1.sacar(15.45, 22, 2, 2020);
        conta1.exibirExtrato();
        
        ContaCorrente conta2 = new ContaCorrente("Maria", 0.0);
        conta2.depositar(600.0, 19, 4, 2020);
        conta2.sacar(50.0, 20, 4, 2020);
        conta2.sacar(100.0, 24, 4, 2020);
        conta2.exibirExtrato();
    }
}
