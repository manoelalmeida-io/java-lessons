/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lista;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author manoe
 */
public class Sorteio {
    
    public static void main(String[] args) {
        
        Integer pares = 0;
        Integer impares = 0;
        Integer primeiraVez = 0;
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite um número de 1 a 100");
        Integer numero = leitor.nextInt();
        
        for (int i = 1; i <= 200; i++) {
            Random aleatorio = new Random();
            Integer sorteado = aleatorio.nextInt(100) + 1;
            
            if (primeiraVez == 0) {
                if (sorteado.equals(numero)) {
                    primeiraVez = i;
                }
            }
            
            if (sorteado % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }
        
        System.out.println("Sorteado pela primeira vez: " + primeiraVez);
        System.out.println("Números pares sorteados: " + pares);
        System.out.println("Números impares sorteados: "+ impares);
    }
}
