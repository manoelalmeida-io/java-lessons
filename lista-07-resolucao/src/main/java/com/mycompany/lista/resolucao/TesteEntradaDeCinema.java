/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lista.resolucao;

/**
 *
 * @author manoel
 */
public class TesteEntradaDeCinema { 
    
    public static void main(String[] args) {
        
        EntradaDeCinema entradaAvatar = new EntradaDeCinema(17, 1, 24, "Avatar");
        EntradaDeCinema entradaVingadores = new EntradaDeCinema(14, 2, 22, "Vingadores: Ultimato");
        
        entradaAvatar.imprimirIngresso(10, true);
        entradaAvatar.imprimirIngresso(15, false);
        entradaAvatar.imprimirIngresso(15, true);
        entradaAvatar.imprimirIngresso(17, true);
        entradaAvatar.imprimirIngresso(35, true);
        
        entradaVingadores.imprimirIngresso(18, false);
        entradaVingadores.imprimirIngresso(45, true);
        entradaVingadores.imprimirIngresso(32, false);
        entradaVingadores.imprimirIngresso(14, true);
        entradaVingadores.imprimirIngresso(17, true);
    }
}
