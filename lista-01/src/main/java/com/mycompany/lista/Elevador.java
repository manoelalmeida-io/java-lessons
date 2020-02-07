/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lista;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Elevador {
    
    public static void main(String[] args) {
        
        Double limitePeso;
        Integer limitePessoas;
        
        Double peso1, peso2, peso3;
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Limite de peso do elevador:");
        limitePeso = leitor.nextDouble();
        
        System.out.println("Limite de pessoas do elevador:");
        limitePessoas = leitor.nextInt();
        
        System.out.println("Peso da 1° pessoa:");
        peso1 = leitor.nextDouble();
        
        System.out.println("Peso da 2° pessoa:");
        peso2 = leitor.nextDouble();
        
        System.out.println("Peso da 3° pessoa:");
        peso3 = leitor.nextDouble();
        
        Double pesoTotal = (peso1 + peso2 + peso3);
        
        System.out.println("Entraram 3 pessoas no elevador, no qual cabem " + limitePessoas + " pessoas");
        System.out.println("O peso total no elevador é de " + pesoTotal + ", sendo que ele suporta " + limitePeso);
    }
}
