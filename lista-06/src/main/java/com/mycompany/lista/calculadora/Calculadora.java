package com.mycompany.lista.calculadora;

public class Calculadora {
    
    private Double operador1 = 0d;
    private Double operador2 = 0d;

    public Double getSoma() {
        return this.operador1 + this.operador2;
    }
    
    public Double getSubtracao() {
        return this.operador1 - this.operador2;
    }
    
    public Double getMultiplicacao() {
        return this.operador1 * this.operador2;
    }
    
    public Double getDivisao() {
        return this.operador1 / this.operador2;
    }
    
    public void setOperador1(Double operador1) {
        this.operador1 = operador1;
    }

    public void setOperador2(Double operador2) {
        this.operador2 = operador2;
    }
}
