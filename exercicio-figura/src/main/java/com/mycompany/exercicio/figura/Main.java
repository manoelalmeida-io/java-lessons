package com.mycompany.exercicio.figura;

public class Main {

    public static void main(String[] args) {
	
	Quadrado q = new Quadrado("Verde", 1, 12.0);
	System.out.println(q);
	
	Quadrado q2 = new Quadrado("Branco", 1, 8.0);
	System.out.println(q2);
	
	Retangulo r = new Retangulo("Marrom", 1, 12.0, 4.0);
	System.out.println(r);
	
	Triangulo t = new Triangulo("Amarelo", 1, 10.0, 4.0);
	System.out.println(t);
	
	Circulo c = new Circulo("Azul", 1, 2.0);
	System.out.println(c);
	
	Imagem imagem = new Imagem();
	imagem.adicionaFigura(q);
	imagem.adicionaFigura(q2);
	imagem.adicionaFigura(r);
	imagem.adicionaFigura(t);
	imagem.adicionaFigura(c);
	
	imagem.exibeFiguras();
	imagem.exibeSomaArea();
	imagem.exibeFiguraAreaMaior20();
	imagem.exibeQuadrado();
    }
}
