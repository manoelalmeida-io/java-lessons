package com.mycompany.exercicio.aluno;

public class AlunoPos extends Aluno {

	private final Double nota1;
	private final Double nota2;
	private final Double notaMonografia;

	public AlunoPos(String nome, Integer ra, Double nota1, Double nota2, Double notaMonografia) {
		super(nome, ra);
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.notaMonografia = notaMonografia;
	}

	@Override
	public Double calculaMedia() {
		return (nota1 + nota2 + notaMonografia) / 3;
	}

	@Override
	public String toString() {
		return "AlunoGraduacao{" + 
				super.toString() 
				+ ", nota1=" + nota1
				+ ", nota2=" + nota2 
				+ ", notaMonografia=" + notaMonografia
				+ ", media=" + String.format("%.2f", calculaMedia()) + '}';
	}
}
