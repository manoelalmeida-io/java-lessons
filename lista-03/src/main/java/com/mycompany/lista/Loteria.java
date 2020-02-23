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
public class Loteria {
    
    public static void main(String[] args) {
        
        Boolean acertou = false;
        Integer tentativas = 1;
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite um número de 0 a 10");
        Integer numero = leitor.nextInt();
        
        while(!acertou) {
            Random aleatorio = new Random();
            Integer tentativa = aleatorio.nextInt(11);
            
            if (tentativa.equals(numero)) {
                acertou = true;
            } else {
                tentativas++;
            }
        }
        
        if (tentativas < 3) {
            System.out.println("Você é MUITO sortudo");
        } else if (tentativas <= 10) {
            System.out.println("Você é sortudo");
        } else {
            System.out.println("É melhor você ser trabalhador");
        }
    }
}
