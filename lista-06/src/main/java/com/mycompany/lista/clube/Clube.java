/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lista.clube;

/**
 *
 * @author manoe
 */
public class Clube {
    
    private Integer vitorias = 0;
    private Integer empates = 0;
    private Integer derrotas = 0;

    public void addVitoria() {
        this.vitorias++;
    }
    
    public void addDerrota() {
        this.derrotas++;
    }
    
    public void addEmpate() {
        this.empates++;
    }
    
    public Integer getVitorias() {
        return vitorias;
    }

    public Integer getEmpates() {
        return empates;
    }

    public Integer getDerrotas() {
        return derrotas;
    }
    
    public Integer getPontuacao() {
        return ((vitorias * 3) + empates);
    }
}
