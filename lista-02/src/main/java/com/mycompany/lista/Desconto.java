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
public class Desconto {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Valor do produto: ");
        Double valorProduto  = leitor.nextDouble();
        
        System.out.println("Código do produto: ");
        Integer codigo = leitor.nextInt();
        
        System.out.println("========================");
        System.out.println(String.format("Valor do produto: R$%.2f", valorProduto));
        
        switch (codigo) {
            case 1:
                System.out.println(String.format("Valor com desconto: R$%.2f" + (valorProduto * 0.95)));
                break;
            case 2:
                System.out.println(String.format("Valor com desconto: R$%.2f", (valorProduto * 0.90)));
                break;
            case 3:
                System.out.println(String.format("Valor com desconto: R$%.2f", (valorProduto * 0.80)));
                break;
            case 4:
                System.out.println(String.format("Valor com desconto: R$%.2f", (valorProduto * 0.50)));
                break;
            default:
                System.out.println("Valor com desconto: Código de desconto inválido");
                break;
        }
    }
}
