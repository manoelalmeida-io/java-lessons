package com.mycompany.projeto.professor.heranca;

public class App {

    public static void main(String[] args) {
        Professor professor = new Professor(1, "Célia", 6, 100.0);
        Coordenador coordenador = new Coordenador(2, "Diego", 4, 100.0, 2, 150.0, "ADS");
        
        Escola escola = new Escola("Bandtec", 5);
        escola.contratarProfessor(professor);
        escola.contratarProfessor(coordenador);
        
        escola.exibirProfessores();
        System.out.println(escola);
    }
}
