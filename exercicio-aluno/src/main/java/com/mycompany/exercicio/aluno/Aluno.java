package com.mycompany.exercicio.aluno;

public abstract class Aluno {

	private final String nome;
	private final Integer ra;

	public Aluno(String nome, Integer ra) {
		this.nome = nome;
		this.ra = ra;
	}

	public abstract Double calculaMedia();

	@Override
	public String toString() {
		return "Aluno{"
				+ "nome=" + nome
				+ ", ra=" + ra + '}';
	}
}
