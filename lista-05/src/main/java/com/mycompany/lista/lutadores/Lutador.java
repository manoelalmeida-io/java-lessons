/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lista.lutadores;

/**
 *
 * @author manoel
 */
public class Lutador {
    private Integer vida = 100;
    private Boolean perdeu = false;
    
    public void apanhar() {
        if (vida > 10) {
            vida -= 10;
        }
        else {
            vida = 0;
            perdeu = true;
        }
    }
    
    public void concentrar() {
        if (vida < 100) {
            vida += 2;
        }
    }

    public Integer getVida() {
        return vida;
    }

    public Boolean getPerdeu() {
        return perdeu;
    }
}
