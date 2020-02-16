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
public class CalculadoraPizza {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        Scanner leitorS = new Scanner(System.in);
        
        System.out.print("Valor da pizza: ");
        Double valorPizza = leitor.nextDouble();
        
        System.out.print("Sabor da pizza: ");
        String saborPizza = leitorS.nextLine();
        
        System.out.print("Quantidade de pessoas que irão rachar a conta: ");
        Integer qtdPessoas = leitor.nextInt();
        
        System.out.print("Valor máximo que cada um irá pagar: ");
        Double valorMaximoPorPessoa = leitor.nextDouble();
        
        Double valorPorPessoa = valorPizza / qtdPessoas; 
        
        if (valorPorPessoa <= valorMaximoPorPessoa) {
            String textoTemplate = "A pizza de sabor %s será dividida entre %d pessoas. R$%.2f p/ cada";
            System.out.println(String.format(textoTemplate, saborPizza, qtdPessoas, valorPorPessoa));
        } else {
            String textoTemplate = "Deu ruim no racha. A pizza deveria custar no máximo R$%.2f";
            System.out.println(String.format(textoTemplate, (valorMaximoPorPessoa * qtdPessoas)));
        }
        
        leitor.close();
        leitorS.close();
    }
}
