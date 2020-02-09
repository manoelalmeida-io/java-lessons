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
public class CalculadoraSalario {

    public static void main(String[] args) {

        Double salario, salarioLiquido;
        Integer porcentagem;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o seu salário:");
        salario = leitor.nextDouble();

        System.out.println("Digite a porcentagem de imposto a ser paga:");
        porcentagem = leitor.nextInt();

        salarioLiquido = salario - (salario * porcentagem / 100);

        System.out.println("Seu salário líquido será: R$" + salarioLiquido);
    }
}
