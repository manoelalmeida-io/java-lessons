/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lista.dadinhos;

import java.util.Random;

/**
 *
 * @author Aluno
 */
public class Dado {
    
    Integer valor;
    Integer vitorias = 0;
    Random aleatorio = new Random();
    
    void sortear() {
        valor = aleatorio.nextInt(6) + 1;
    }
    
    void acrescentarVitoria() {
        vitorias++;
    }
}
