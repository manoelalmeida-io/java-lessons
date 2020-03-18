/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projeto.encapsulamento.conta;

/**
 *
 * @author Aluno
 */
public class TesteConta {
    
    public static void main(String[] args) {
        
        ContaCorrente conta01 = new ContaCorrente();
        
        conta01.depositar50();
        System.out.println("O saldo agora é " + conta01.getSaldo());
        
        conta01.depositar50();
        System.out.println("O saldo agora é " + conta01.getSaldo());
        
        conta01.sacar50();
        System.out.println("O saldo agora é " + conta01.getSaldo());
    }
}
