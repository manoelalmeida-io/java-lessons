/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lista.elevadors;

/**
 *
 * @author manoel
 */
public class Elevador {
    private Integer peso = 0;
    private Integer qtdPessoas = 0;

    public void entrarHomem() {
        peso += 90;
        qtdPessoas++;
    }
    
    public void entrarMulher() {
        peso += 65;
        qtdPessoas++;
    }
    
    public void entrarCrianca() {
        peso += 40;
        qtdPessoas++;
    }
    
    public Integer getPeso() {
        return peso;
    }

    public Integer getQtdPessoas() {
        return qtdPessoas;
    }
}
