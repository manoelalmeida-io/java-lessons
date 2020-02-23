/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lista;

/**
 *
 * @author manoe
 */
public class VariacaoContador {
    
    public static void main(String[] args) {
        
        Double contador = 0.0;
        
        while (contador < 5) {
            System.out.println(String.format("%.2f", contador));
            contador += 0.15;
        }
    }
}
