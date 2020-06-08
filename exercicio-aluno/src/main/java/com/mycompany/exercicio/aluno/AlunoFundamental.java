package com.mycompany.exercicio.aluno;

public class AlunoFundamental extends Aluno {

	private final Double nota1;
	private final Double nota2;
	private final Double nota3;
	private final Double nota4;

	public AlunoFundamental(String nome, Integer ra, Double nota1, Double nota2, Double nota3, Double nota4) {
		super(nome, ra);
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
		this.nota4 = nota4;
	}

	@Override
	public Double calculaMedia() {
		return (nota1 + nota2 + nota3 + nota4) / 4;
	}

	@Override
	public String toString() {
		return "AlunoFundamental{"
				+ super.toString()
				+ ", nota1=" + nota1
				+ ", nota2=" + nota2
				+ ", nota3=" + nota3
				+ ", nota4=" + nota4
				+ ", media=" + String.format("%.2f", calculaMedia()) + '}';
	}
}
