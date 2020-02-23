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
public class Potencia {
    
    public static void main(String[] args) {
        
        Integer resultado = 1;
        Integer base, expoente;
        
        Scanner leitor = new Scanner(System.in);
        
        do {
            System.out.println("Digite o valor da base:");
            base = leitor.nextInt();
        } while (base <= 0);
        
        do {
            System.out.println("Digite o valor do expoente:");
            expoente = leitor.nextInt();
        } while (expoente <= 0);
        
        for (Integer i = 0; i < expoente; i++) {
            resultado *= base;
        }
        
        System.out.println("Resultado: " + resultado);
    }
}
