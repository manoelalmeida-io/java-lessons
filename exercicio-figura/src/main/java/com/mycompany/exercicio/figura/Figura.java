package com.mycompany.exercicio.figura;

public abstract class Figura {
    
    private final String cor;
    private final Integer espessura;

    public Figura(String cor, Integer espessura) {
        this.cor = cor;
        this.espessura = espessura;
    }
    
    public abstract Double calculaArea();
    
    @Override
    public String toString() {
        return "Figura{" 
                + "cor=" + cor 
                + ", espessura=" + espessura + '}';
    }
}
