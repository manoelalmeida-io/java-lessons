package com.mycompany.exercicio.aluno;

public class AlunoGraduacao extends Aluno {

	private final Double nota1;
	private final Double nota2;

	public AlunoGraduacao(String nome, Integer ra, Double nota1, Double nota2) {
		super(nome, ra);
		this.nota1 = nota1;
		this.nota2 = nota2;
	}

	@Override
	public Double calculaMedia() {
		return (nota1 * 0.4 + nota2 * 0.6);
	}

	@Override
	public String toString() {
		return "AlunoGraduacao{" + 
				super.toString() 
				+ ", nota1=" + nota1 
				+ ", nota2=" + nota2
				+ ", media=" + String.format("%.2f", calculaMedia()) + '}';
	}
}
