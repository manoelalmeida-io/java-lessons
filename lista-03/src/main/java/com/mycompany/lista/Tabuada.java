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
public class Tabuada {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro: ");
        Integer numero = leitor.nextInt();
        
        for (int i = 0; i <= 10; i++) {
            String formato = "%d x %d = %d";
            System.out.println(String.format(formato, numero, i, (numero * i)));
        }
        
        leitor.close();
    }
}
