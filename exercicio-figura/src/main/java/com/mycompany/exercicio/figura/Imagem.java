package com.mycompany.exercicio.figura;

import java.util.ArrayList;
import java.util.List;

public class Imagem {

	private final List<Figura> figuras;

	public Imagem() {
		this.figuras = new ArrayList<>();
	}

	public void adicionaFigura(Figura f) {
		this.figuras.add(f);
	}

	public void exibeFiguras() {
		System.out.println("# Todas as figuras:");
		this.figuras.stream().forEach(System.out::println);
	}

	public void exibeSomaArea() {
		Double soma = this.figuras
				.stream()
				.map(figura -> figura.calculaArea())
				.reduce(0.0, (subtotal, current) -> subtotal + current);

		System.out.println(String.format("# Soma da área de todas as figuras: %.2f", soma));
	}

	public void exibeFiguraAreaMaior20() {
		System.out.println("# Figuras com área maior que 20:");

		this.figuras.stream()
				.filter(figura -> figura.calculaArea() > 20)
				.forEach(System.out::println);
	}

	public void exibeQuadrado() {
		System.out.println("# Exibe todos os quadrados:");

		this.figuras.stream()
				.filter(figura -> figura instanceof Quadrado)
				.forEach(System.out::println);
	}
}
