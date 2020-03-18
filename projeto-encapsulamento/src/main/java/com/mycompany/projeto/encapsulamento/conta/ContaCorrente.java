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
public class ContaCorrente {
    
    private Double saldo = 0.0;
    private Integer operacoes = 0;
    
    public void depositar50() {
        saldo += 50;
        operacoes++;
    }
    
    public void sacar50() {
        if (saldo >= 50) {
            saldo -= 50;
            operacoes++;
        }
    }

    public Double getSaldo() {
        return saldo;
    }
    
    public Integer getOperacoes() {
        return operacoes;
    }
}
