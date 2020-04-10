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
public class TesteTermometro {
    
    public static void main(String[] args) {
        Termometro termometro = new Termometro(24.0);
        
        termometro.exibir();
        
        termometro.aumentaTemperatura(1.0);
        termometro.exibir();
        
        termometro.diminuiTemperatura(0.5);
        termometro.exibir();
        
        termometro.diminuiTemperatura(0.5);
        termometro.exibir();
        
        termometro.diminuiTemperatura(1.5);
        termometro.exibir();
    }
}
