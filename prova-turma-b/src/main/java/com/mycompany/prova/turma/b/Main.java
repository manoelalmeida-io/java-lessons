/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.prova.turma.b;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Main {
    
    public static void main(String[] args) {
        
        String nome;
        String formato = "Valor depositado no %d° dia: ";
        
        Double total = 0d;
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o seu nome");
        nome = leitor.nextLine();
        
        for(Integer dia = 1; dia < 8; dia++) {
            System.out.println(String.format(formato, dia));
            Double valorDepositado = leitor.nextDouble();
            
            Integer valorInteiro = Integer.valueOf(String.format("%.0f", valorDepositado * 100));
            
            switch(valorInteiro) {
                case 1:
                case 5:
                case 10:
                case 25:
                case 50:
                case 100:
                    total += valorDepositado;
                    break;
                default:
                    break;
            }
        }
        
        String formatoFinal = "Ao final de 7 dias, %s guardou R$%.2f";
        System.out.println(String.format(formatoFinal, nome, total));
    }
}
