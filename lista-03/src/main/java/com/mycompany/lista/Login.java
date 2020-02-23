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
public class Login {
    
    public static void main(String[] args) {
        
        Boolean autenticado = false;
        
        Scanner leitor = new Scanner(System.in);
        
        do {
            System.out.print("Usuário: ");
            String email = leitor.next();
            
            System.out.print("Senha: ");
            String senha = leitor.next();
            
            if (email.equals("admin") && senha.equals("#bandtec")) {
                autenticado = true;
            } else {
                System.out.println("Login e/ou senha inválidos");
            }
        } while (!autenticado);
        
        System.out.println("Login realizado com sucesso");
    }
}
