/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lista.resolucao;

/**
 *
 * @author manoel
 */
public class TesteEmpregado {
    
    public static void main(String[] args) {
        Empregado joao = new Empregado("João", "Analista de Sistemas", 5400.0);
        joao.reajustarSalario(15);
        joao.imprimir();
        
        Empregado matheus = new Empregado("Matheus Lucas", "Estagiário", 1500.0);
        matheus.reajustarSalario(10);
        matheus.imprimir();
    }
}
