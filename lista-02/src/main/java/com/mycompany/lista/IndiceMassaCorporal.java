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
public class IndiceMassaCorporal {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Altura do usuário: ");
        Double altura = leitor.nextDouble();
        
        System.out.print("Peso do usuário: ");
        Double peso = leitor.nextDouble();
        
        System.out.print("Sexo do usuário: ");
        String sexo = leitor.next();
        
        Double imc = peso / (altura * altura);
        
        System.out.println(String.format("IMC: %.2f", imc));
        System.out.print("Situação: ");
        
        if (sexo.equalsIgnoreCase("Homem") || sexo.equalsIgnoreCase("H")) {
            
            if (imc < 20.7) {
                System.out.println("Abaixo do peso");
            }
            else if (imc <= 26.4) {
                System.out.println("No peso normal");
            }
            else if (imc <= 27.8) {
                System.out.println("Marginalmente acima do peso");
            }
            else if (imc <= 31.1) {
                System.out.println("Acima do peso ideal");
            }
            else {
                System.out.println("Obeso");
            }
        }
        else if (sexo.equalsIgnoreCase("Mulher") || sexo.equalsIgnoreCase("M")) {
            
            if (imc < 19.1) {
                System.out.println("Abaixo do peso");
            }
            else if (imc <= 25.8) {
                System.out.println("No peso normal");
            }
            else if (imc <= 27.3) {
                System.out.println("Marginalmente acima do peso");
            }
            else if (imc <= 32.3) {
                System.out.println("Acima do peso ideal");
            }
            else {
                System.out.println("Obeso");
            }
        }
        else {
            System.out.println("Sexo inválido");
        }
    }
}
