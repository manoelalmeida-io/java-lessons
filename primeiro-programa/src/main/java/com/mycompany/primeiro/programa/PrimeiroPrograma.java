/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.primeiro.programa;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class PrimeiroPrograma {
    
    public static void main(String[] args) {

        String nome, turma;
        Integer num1, num2, soma;
        Double nota, notaContinuada = 7.5;

        System.out.print("Boa noite!\n");
        System.out.println("Tudo bem?");

        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite o seu nome: ");
        nome = leitor.nextLine();
        System.out.println("Como vai, " + nome + "?");

        System.out.print("Digite um número: ");
        num1 = leitor.nextInt();

        System.out.print("Digite outro número: ");
        num2 = leitor.nextInt();

        soma = num1 + num2;

        System.out.println("A soma é " + soma);
        System.out.println("A multiplicação é " + (num1 * num2));

        System.out.print("Digite a sua nota: ");
        nota = leitor.nextDouble();
        System.out.println("Sua nota é: " + nota);
        System.out.println("Sua nota continuada é: " + notaContinuada);
        System.out.println("Sua média é: " + (nota + notaContinuada) / 2);

        Scanner leitorS = new Scanner(System.in);

        System.out.println("Digite a sua turma: ");
        turma = leitorS.nextLine();
    }
}
