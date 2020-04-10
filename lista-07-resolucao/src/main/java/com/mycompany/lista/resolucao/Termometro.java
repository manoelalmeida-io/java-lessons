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
public class Termometro {
    private Double temperaturaAtual;
    private Double temperaturaMax;
    private Double temperaturaMin;

    public Termometro(Double temperaturaAtual) {
        this.temperaturaAtual = temperaturaAtual;
        this.temperaturaMax = temperaturaAtual;
        this.temperaturaMin = temperaturaAtual;
    }
    
    public void aumentaTemperatura(Double quantidade) {
        this.temperaturaAtual += quantidade;
        
        if (this.temperaturaAtual > this.temperaturaMax) 
            this.temperaturaMax = this.temperaturaAtual;
    }
    
    public void diminuiTemperatura(Double quantidade) {
        this.temperaturaAtual -= quantidade;
        
        if(this.temperaturaAtual < this.temperaturaMin)
            this.temperaturaMin = this.temperaturaAtual;
    }
    
    public void exibeFahreinheit() {
        Double temperaturaF = (this.temperaturaAtual * 9/5) + 32;
        System.out.println(String.format("°F: %.1f", temperaturaF));
    }
    
    public void exibeCelsius() {
        System.out.println(String.format("°C: %.1f", this.temperaturaAtual));
    }
    
    public void exibir() {
        System.out.println("=============================");
        System.out.println("Temperatura atual:");
        
        this.exibeCelsius();
        this.exibeFahreinheit();
        
        System.out.println(String.format("Max: { °C: %.1f, °F: %.1f }",
                this.temperaturaMax, fahreinheit(temperaturaMax)));
        
        System.out.println(String.format("Min: { °C: %.1f, °F: %.1f }", 
                this.temperaturaMin, fahreinheit(temperaturaMin)));
    }
    
    private Double fahreinheit(Double temperatura) {
        return (temperatura * 9/5) + 32;
    }
}
