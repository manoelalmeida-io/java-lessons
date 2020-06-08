package com.mycompany.exercicio.aluno;

import java.util.ArrayList;
import java.util.List;

public class Cadastro {

	private final List<Aluno> alunos;

	public Cadastro() {
		this.alunos = new ArrayList<>();
	}
	
	public void adicionaAluno(Aluno a) {
		alunos.add(a);
	}
	
	public void exibeAlunosFundamental() {
		System.out.println("# Alunos do fundamental");
		alunos.stream()
				.filter(aluno -> aluno instanceof AlunoFundamental)
				.forEach(System.out::println);
	}
	
	public void exibeAlunosGraduacao() {
		System.out.println("# Alunos de graduação");
		alunos.stream()
				.filter(aluno -> aluno instanceof AlunoGraduacao)
				.forEach(System.out::println);
	}
	
	public void exibeAlunosPos() {
		System.out.println("# Alunos de pos graduação");
		alunos.stream()
				.filter(aluno -> aluno instanceof AlunoPos)
				.forEach(System.out::println);
	}
}
