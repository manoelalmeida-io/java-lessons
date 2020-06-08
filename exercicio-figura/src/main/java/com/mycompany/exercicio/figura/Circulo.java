package com.mycompany.exercicio.figura;

public class Circulo extends Figura {

    private final Double raio;

    public Circulo(String cor, Integer espessura, Double raio) {
        super(cor, espessura);
        this.raio = raio;
    }

    @Override
    public Double calculaArea() {
        return Math.PI * Math.pow(raio, 2);
    }

    @Override
    public String toString() {
        return "Circulo{" 
                + super.toString() 
                + ", raio=" + raio 
                + ", area=" + calculaArea() + '}';
    }
}
