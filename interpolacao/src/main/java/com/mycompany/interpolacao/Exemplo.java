/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.interpolacao;

/**
 *
 * @author Aluno
 */
public class Exemplo {
    
    public static void main(String[] args) {
        
        String nome = "Manoel Almeida";
        String texto = String.format("Boa tarde %s", nome);
        String facul = "Bandtec";

        Double numeroReal = 42.66666;
        
        Integer numeroInteiro = 42;
        
        System.out.println(texto);
        System.out.println(String.format("Bem vindo a %s", facul));
        System.out.println(String.format("Meu nome: %s e local de estudo: %s", nome, facul));
        
        System.out.println(String.format("Número inteiro: %d", numeroInteiro));
        System.out.println(String.format("Outro número: %.2f", numeroReal));
    }
}
