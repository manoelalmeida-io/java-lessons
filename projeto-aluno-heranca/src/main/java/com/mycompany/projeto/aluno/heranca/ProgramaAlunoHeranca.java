package com.mycompany.projeto.aluno.heranca;

public class ProgramaAlunoHeranca {

    public static void main(String[] args) {
        Aluno aluno = new Aluno(1192021, "Manoel", 6.7, 7.8);
        System.out.println(String.format("O aluno %s tem média %.2f", aluno.getNome(), aluno.calculaMedia()));
        System.out.println(aluno);
        
        Aluno aluno2 = new Aluno(1192022, "Carlos", 8.3, 9.2);
        System.out.println(String.format("O aluno %s tem média %.2f", aluno2.getNome(), aluno2.calculaMedia()));
        System.out.println(aluno2);
        
        AlunoPos alunoPos = new AlunoPos(1192021, "Manoel", 6.7, 7.8, 8.9);
        System.out.println(String.format("O aluno %s tem média %.2f", alunoPos.getNome(), alunoPos.calculaMedia()));
        System.out.println(alunoPos);
        
        Faculdade faculdade = new Faculdade("Bandtec", 65);
        faculdade.matricularAluno(aluno);
        faculdade.matricularAluno(aluno2);
        faculdade.matricularAluno(alunoPos);
        
        faculdade.exibirAlunosMatriculados();
        System.out.println(faculdade);
    }
}
