/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.status;

import java.util.Random;

/**
 *
 * @author Aluno
 */
public class Componente {
    
    Integer valor = 0;
    String status = "Suave";
    String cor = "#00008b";
    Random aleatorio = new Random();
    
    void aleatorio() {
        valor = aleatorio.nextInt(100);
        
        if(valor >= 0 && valor <= 20) {
            cor = "#3F51B5";
            status = "Suave";
        }
        else if (valor <= 70) {
            cor = "#bb94c0";
            status = "Atenção";
        }
        else {
            cor = "#ff0000";
            status = "Crítico";
        }
    }
}
