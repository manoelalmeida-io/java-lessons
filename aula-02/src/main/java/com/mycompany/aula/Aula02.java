/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aula;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Aula02 {
    
    public static void main(String[] args) {
        Integer idade, numero, valorDado, chute, diaSemana, lugar;
        String nomeFacul;
        Random aleatorio = new Random();
        
        Scanner leitor = new Scanner(System.in);
        Scanner leitorS = new Scanner(System.in);
        
        System.out.println("Digite a sua idade");
        idade = leitor.nextInt();
        
        if (idade >= 18) {
            System.out.println("Já pode tirar certeira de habilitação");
        }
        
        System.out.println("Digite um número inteiro");
        numero = leitor.nextInt();
        
        if (numero % 2 == 0) {
            System.out.println(numero + " é par");
        }
        else {
            System.out.println(numero + " é impar");
        }
        
        System.out.println("Digite o nome da sua faculdade");
        nomeFacul = leitorS.nextLine();
        
        if (nomeFacul.equals("Bandtec")) {
            System.out.println("Parabéns! Ótima escolha!!!");
        }
        
        // vamos simular que estamos jogando um dado
        valorDado = aleatorio.nextInt(6) + 1;
        
        System.out.println("Tente acertar o valor do dado");
        chute = leitor.nextInt();

        if (valorDado.equals(chute)) {
            System.out.println("Parabéns! você acertou");
        }
        else {
            System.out.println("Não foi dessa vez!");
        }
    
        System.out.println("O valor do dado é " + valorDado);
        
        System.out.println("\nDigite um número de 1 a 7");
        diaSemana = leitor.nextInt();
        
        switch(diaSemana){
            case 1: 
                System.out.println("Domingo");
                break;
            case 2: 
                System.out.println("Segunda-feira");
                break;
            case 3: 
                System.out.println("Terça-feira");
                break;
            case 4: 
                System.out.println("Quarta-feira");
                break;
            case 5: 
                System.out.println("Quinta-feira");
                break;
            case 6: 
                System.out.println("Feira-feira");
                break;
            case 7: 
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Número inválido");
                break;
        }
        
        System.out.println("Digite a posição: " + 
                "\n1° lugar: Iphone, Ipad, Ipod" +
                "\n2° lugar: Ipad e Ipod" + 
                "\n3° lugar: Ipod");
        
        lugar = leitor.nextInt();
        
        System.out.print("Você ganhou ");
        
        switch(lugar) {
            case 1: System.out.print(" um Iphone,");
            case 2: System.out.print(" um ipad e ");
            case 3: System.out.println(" um Ipod.");
            break;
            default: System.out.println(" nada.");
            break;
        }
    }
}
