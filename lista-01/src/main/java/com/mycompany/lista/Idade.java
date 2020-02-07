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
public class Idade {
    
    public static void main(String[] args) {
        
        String nome;
        Integer nascimento;
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Qual é o seu nome?");
        nome = leitor.nextLine();
        
        System.out.println("Olá, " + nome + "! Qual o seu ano de nascimento?");
        nascimento = leitor.nextInt();
        
        Integer anos = 2030 - nascimento;
        
        System.out.println("Em 2030 você terá " + anos + " anos.");
    }
}
