package com.mycompany.exercicio.figura;

public class Quadrado extends Figura {

    private final Double lado;

    public Quadrado(String cor, Integer espessura, Double lado) {
        super(cor, espessura);
        this.lado = lado;
    }
    
    @Override
    public Double calculaArea() {
        return Math.pow(lado, 2);
    }

    @Override
    public String toString() {
        return "Quadrado{" 
                + super.toString() 
                + ", lado=" + lado 
                + ", area=" + calculaArea() + '}';
    }
}
