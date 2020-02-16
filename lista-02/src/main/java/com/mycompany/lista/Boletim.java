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
public class Boletim {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Primeira nota: ");
        Double notas = leitor.nextDouble();
        
        System.out.print("Segunda nota: ");
        notas += leitor.nextDouble();
        
        System.out.print("Terceira nota: ");
        notas += leitor.nextDouble();
        
        Double media = notas / 3;
        
        if (media >= 7) {
            System.out.println("Passou direto");
        }
        else if (media >= 5) {
            System.out.println("Têm direito de fazer uma prova de recuperação");
        }
        else {
            System.out.println("Reprovado direto");
        }
    }
}
