package com.mycompany.exercicio.figura;

public class Retangulo extends Figura {

    private final Double base;
    private final Double altura;

    public Retangulo(String cor, Integer espessura, Double base, Double altura) {
        super(cor, espessura);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public Double calculaArea() {
        return base * altura;
    }

    @Override
    public String toString() {
        return "Retangulo{" 
                + super.toString() 
                + ", base=" + base 
                + ", altura=" + altura 
                + ", area=" + calculaArea() + '}';
    }
}
