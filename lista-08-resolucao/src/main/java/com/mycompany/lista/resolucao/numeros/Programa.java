/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lista.resolucao.numeros;

import java.util.Scanner;

/**
 *
 * @author manoe
 */
public class Programa {
    
    public static void main(String[] args) {
        Numeros numeros = new Numeros();
        Boolean sair = false;
        Scanner leitor = new Scanner(System.in);
        
        while (!sair) {
            System.out.print("Digite um número: ");
            Integer numero = leitor.nextInt();
            
            if (numero != 0) {
                numeros.add(numero);
            }
            else {
                sair = true;
            }
        }
        
        System.out.println("Numeros pares: " + numeros.pares());
        System.out.println("Numeros impares: " + numeros.impares());
        System.out.println("Soma dos números: " + numeros.soma());
        System.out.println("Menor número: " + numeros.menor());
        System.out.println("Maior número: " + numeros.maior());
    }
}
