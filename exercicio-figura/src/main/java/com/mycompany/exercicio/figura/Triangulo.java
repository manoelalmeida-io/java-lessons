package com.mycompany.exercicio.figura;

public class Triangulo extends Figura {

    private final Double base;
    private final Double altura;

    public Triangulo(String cor, Integer espessura, Double base, Double altura) {
        super(cor, espessura);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public Double calculaArea() {
        return base * altura / 2;
    }

    @Override
    public String toString() {
        return "Triangulo{" 
                + super.toString() 
                + ", base=" + base 
                + ", altura=" + altura 
                + ", area=" + calculaArea() + '}';
    }
}
