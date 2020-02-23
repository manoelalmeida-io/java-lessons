/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lista;

import java.util.Scanner;

/**
 *
 * @author manoe
 */
public class Acumulador {
    
    public static void main(String[] args) {
        
        Double acumulador = 0.0;
        Double valorLido;
        
        Scanner leitor = new Scanner(System.in);
        
        do {
            System.out.println("Digite um número");
            valorLido = leitor.nextDouble();
            
            acumulador += valorLido;
        } while (valorLido != 0.0);
        
        System.out.println("Soma dos valores: " + acumulador);
    }
}
