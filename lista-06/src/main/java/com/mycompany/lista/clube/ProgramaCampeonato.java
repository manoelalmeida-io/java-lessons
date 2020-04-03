/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lista.clube;

import java.util.Random;

/**
 *
 * @author manoe
 */
public class ProgramaCampeonato {
    
    public static void main(String[] args) {
        Clube realmadrid = new Clube();
        Clube barcelona = new Clube();
    
        System.out.println("Começa a temporada!\n");
        
        for (int i = 0; i < 10; i++) {
            novaRodada(realmadrid, barcelona);
        }
        
        System.out.println("Final de temporada:");
        
        mostrarResultado("Real Madrid", realmadrid);
        mostrarResultado("Barcelona", barcelona);
    }
    
    private static void novaRodada(Clube clube1, Clube clube2) {
        Random random = new Random();
        
        Integer resultado1 = random.nextInt(3);
        Integer resultado2 = random.nextInt(3);
        
        conferirResultado("Real Madrid", resultado1, clube1);
        conferirResultado("Barcelona", resultado2, clube2);
        
        System.out.println("\nReal Madrid pontos: " + clube1.getPontuacao());
        System.out.println("Barcelona pontos: " + clube2.getPontuacao());
        
        System.out.println("\n-------------------------------\n");
    }
    
    private static void mostrarResultado(String nome, Clube clube) {
        System.out.print("\n" + nome + " ");
        System.out.print(clube.getVitorias() + " vitórias ");
        System.out.print(clube.getEmpates() + " empates ");
        System.out.println(clube.getDerrotas() + " derrotas");
        System.out.println("Total de pontos: " + clube.getPontuacao().toString());
    }
    
    private static void conferirResultado(String nome, Integer resultado, Clube clube) {
        switch (resultado) {
            case 0:
                System.out.println(nome + " ganhou nessa rodada");
                clube.addVitoria();
                break;
            case 1:
                System.out.println(nome + " empatou nessa rodada");
                clube.addEmpate();
                break;
            case 2:
                System.out.println(nome + " perdeu nessa rodada");
                clube.addDerrota();
                break;
        }
    }
}
