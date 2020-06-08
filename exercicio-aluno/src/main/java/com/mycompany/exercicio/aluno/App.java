package com.mycompany.exercicio.aluno;

public class App {

	public static void main(String[] args) {
		AlunoFundamental a1 = new AlunoFundamental("Pedro", 9823, 8.0, 9.2, 7.8, 9.3);
		System.out.println(a1);
		AlunoFundamental a2 = new AlunoFundamental("Rafael", 2724, 9.9, 8.7, 7.8, 6.3);
		System.out.println(a2);
		
		AlunoGraduacao a3 = new AlunoGraduacao("Manoel", 7234, 9.2, 7.8);
		System.out.println(a3);
		
		AlunoPos a4 = new AlunoPos("André", 9239, 5.6, 8.7, 7.7);
		System.out.println(a4);

		Cadastro cadastro = new Cadastro();
		cadastro.adicionaAluno(a1);
		cadastro.adicionaAluno(a2);
		cadastro.adicionaAluno(a3);
		cadastro.adicionaAluno(a4);
		
		cadastro.exibeAlunosFundamental();
		cadastro.exibeAlunosGraduacao();
		cadastro.exibeAlunosPos();
	}
}
