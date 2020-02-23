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
public class Votacao {
    
    public static void main(String[] args) {
        
        Integer mussarela = 0;
        Integer calabresa = 0;
        Integer quatroQueijos = 0;
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Sabores de pizza");
        System.out.println("Mussarela (5)");
        System.out.println("Calabresa (25)");
        System.out.println("Quatro Queijos (50)");
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Sabor favorito aluno " + (i + 1) + ":");
            Integer voto = leitor.nextInt();
            
            switch (voto) {
                case 5:
                    mussarela++;
                    break;
                case 25:
                    calabresa++;
                    break;
                case 50:
                    quatroQueijos++;
                    break;
            }
        }
        
        System.out.println("Votos mussarela: " + mussarela);
        System.out.println("Votos calabresa: " + calabresa);
        System.out.println("Votos quatro queijos: " + quatroQueijos);
        
        String favorita = "Mussarela";
        Integer maisVotos = mussarela;
        
        if (calabresa > maisVotos) {
            maisVotos = calabresa;
            favorita = "Calabresa";
        }
        
        if (calabresa.equals(maisVotos)) {
            favorita += ", Calabresa";
        }
        
        if (quatroQueijos > maisVotos) {
            maisVotos = quatroQueijos;
            favorita = "Quatro queijos";
        }
        
        if (quatroQueijos.equals(maisVotos)) {
            favorita += ", Quatro queijos";
        }
        
        System.out.println("Sabor favorito: " + favorita);
    }
}
