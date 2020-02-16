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
public class Sorveteria {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Escolha o produto:");
        System.out.println("[1]Casquinha");
        System.out.println("[2]Sundae");
        System.out.println("[3]Milkshake");
        
        Integer escolha = leitor.nextInt();
        
        switch (escolha) {
            case 1:
                System.out.println("A casquinha custa R$2,00");
                break;
            case 2:
                System.out.println("O sundae custa R$5,00");
                break;
            case 3:
                System.out.println("O milkshake custa R$7,00");
                break;
            default:
                System.out.println("Produto não encontrado");
                break;
        }
        
        leitor.close();
    }
}
