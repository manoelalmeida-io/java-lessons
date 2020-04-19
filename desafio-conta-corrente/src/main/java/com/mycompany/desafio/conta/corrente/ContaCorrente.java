/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.desafio.conta.corrente;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author manoe
 */
public class ContaCorrente {
    
    private String titular;
    private Double saldo;
    private List<Historico> ocorrencias;

    public ContaCorrente(String titular, Double saldo) {
        this.titular = titular;
        this.saldo = saldo;
        this.ocorrencias = new ArrayList<>();
    }
    
    public void depositar(Double valor, Integer dia, Integer mes, Integer ano) {
        saldo += valor;
        ocorrencias.add(new Historico(dia, mes, ano, valor, "Depósito"));
    }
    
    public void sacar(Double valor, Integer dia, Integer mes, Integer ano) {
        if (valor <= saldo) {
            saldo -= valor;
            ocorrencias.add(new Historico(dia, mes, ano, valor, "Saque"));
        }
        else {
            System.out.println("Operação inválida");
        }
    }
    
    public void exibirExtrato() {
        System.out.println("=============== Extrato ===============");
        System.out.println("Titular: " + titular);
        System.out.println(String.format("Saldo: R$%.2f", saldo));
        
        for (Historico ocorrencia : ocorrencias) {
            System.out.println("---------------------------------------");
            System.out.println("Operação: " + ocorrencia.getOperacao());
            System.out.println(String.format("Valor: R$%.2f", ocorrencia.getValor()));
            System.out.println(
                    String.format("Data:{ dia: %d, mes: %d, ano: %d }", 
                            ocorrencia.getDia(),
                            ocorrencia.getMes(),
                            ocorrencia.getAno()));
        }
    }

    public String getTitular() {
        return titular;
    }

    public Double getSaldo() {
        return saldo;
    }

    public List<Historico> getOcorrencias() {
        return ocorrencias;
    }
    
    @Override
    public String toString() {
        return "ContaCorrente{" + 
                "titular=" + titular + 
                ", saldo=" + saldo + 
                ", ocorrencias=" + ocorrencias + '}';
    }
}
