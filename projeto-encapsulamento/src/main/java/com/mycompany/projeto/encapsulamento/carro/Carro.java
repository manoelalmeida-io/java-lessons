/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projeto.encapsulamento.carro;

/**
 *
 * @author Aluno
 */
public class Carro {
    
    private Double velocidade = 0.0;
    private Boolean ligado = false;
    
    public void ligar() {
        ligado = true;
    }
    
    public void acelerar() {
        if (ligado && velocidade < 120.0) {
            velocidade += 10.0;
        }
    }
    
    public void frear() {
        if (ligado && velocidade >= 10.0) {
            velocidade -= 10.0;
        }
    }
    
    public void desligar() {
        ligado = false;
        velocidade = 0.0;
    }
    
    public Double getVelocidade() {
        return velocidade;
    }
    
    public Boolean getLigado() {
        return ligado;
    }
}
