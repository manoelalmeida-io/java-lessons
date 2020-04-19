/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lista.resolucao.frutas;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author manoe
 */
public class Frutas {

    private List<String> frutas;

    public Frutas() {
        frutas = new ArrayList<>();
        frutas.add("Banana");
        frutas.add("Laranja");
        frutas.add("Goiaba");
        frutas.add("Melancia");
        frutas.add("Maça");
    }
    
    public Boolean existeNaLista(String pesquisa) {
        for (String fruta : frutas) {
            if (fruta.equals(pesquisa)) {
                return true;
            }
        }
        
        return false;
    }
}
