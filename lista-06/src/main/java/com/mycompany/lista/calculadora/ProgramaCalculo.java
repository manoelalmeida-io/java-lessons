package com.mycompany.lista.calculadora;

public class ProgramaCalculo {
    
    public static void main(String[] args) {
        
        Calculadora calculadora = new Calculadora();
        
        System.out.println("Iniciando programa calculadora...\n");
        
        System.out.println("10 + 2 = " + soma(calculadora, 10.0, 2.0));
        System.out.println("10 - 2 = " + subtracao(calculadora, 10.0, 2.0));
        System.out.println("10 * 2 = " + multiplicacao(calculadora, 10.0, 2.0));
        System.out.println("10 / 2 = " + divisao(calculadora, 10.0, 2.0));
    }
    
    private static Double soma(Calculadora calculadora, Double num1, Double num2) {
        calculadora.setOperador1(num1);
        calculadora.setOperador2(num2);
        
        return calculadora.getSoma();
    }
    
    private static Double subtracao(Calculadora calculadora, Double num1, Double num2) {
        calculadora.setOperador1(num1);
        calculadora.setOperador2(num2);
        
        return calculadora.getSubtracao();
    }
    
    private static Double multiplicacao(Calculadora calculadora, Double num1, Double num2) {
        calculadora.setOperador1(num1);
        calculadora.setOperador2(num2);
        
        return calculadora.getMultiplicacao();
    }
    
    private static Double divisao(Calculadora calculadora, Double num1, Double num2) {
        calculadora.setOperador1(num1);
        calculadora.setOperador2(num2);
        
        return calculadora.getDivisao();
    }
}
