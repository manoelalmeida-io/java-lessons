/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aula;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Media {
    
    public static void main(String[] args) {
        
        Double notas = 0d;
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite a primeira nota");
        notas += leitor.nextDouble();
        
        System.out.println("Digite a segunda nota");
        notas += leitor.nextDouble();
        
        Double media = notas / 2;
        System.out.println(String.format("Sua média é %.2f", media));
        
        if (media >= 5) {
            System.out.println("Parabéns! Você foi aprovado");
        }
        else {
            System.out.println("Você foi reprovado");
        }
    }
}
