/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lista.resolucao.numeros;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author manoe
 */
public class Numeros {
    
    List<Integer> numeros;

    public Numeros() {
        numeros = new ArrayList<>();
    }
    
    public void add(Integer numero) {
        numeros.add(numero);
    }
    
    public List<Integer> pares() {
        List<Integer> lista = new ArrayList<>();
        
        for (Integer numero : numeros) {
            if (numero % 2 == 0) {
                lista.add(numero);
            }
        }
        
        return lista;
    }
    
    public List<Integer> impares() {
        List<Integer> lista = new ArrayList<>();
        
        for (Integer numero : numeros) {
            if (numero % 2 != 0) {
                lista.add(numero);
            }
        }
        
        return lista;
    }
    
    public Integer soma() {
        Integer total = 0;
        
        for (Integer numero : numeros) {
            total += numero;
        }
        
        return total;
    }
    
    public Integer menor() {
        Integer menor = numeros.get(0);
        
        for (Integer numero : numeros) {
            if (numero < menor) {
                menor = numero;
            }
        }
        
        return menor;
    }
    
    public Integer maior() {
        Integer maior = numeros.get(0);
        
        for (Integer numero : numeros) {
            if (numero > maior) {
                maior = numero;
            }
        }
        
        return maior;
    }
}
