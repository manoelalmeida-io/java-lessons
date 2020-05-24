package com.mycompany.projeto.aluno.heranca;

public class AlunoPos extends Aluno {

    private Double notaMonografia;
    
    public AlunoPos(Integer ra, String nome, Double notaContinuada, Double notaSemestral, Double notaMonografia) {
        super(ra, nome, notaContinuada, notaSemestral);
        this.notaMonografia = notaMonografia;
    }

    public Double getNotaMonografia() {
        return notaMonografia;
    }
    
    @Override
    public Double calculaMedia() {
        return (this.getNotaContinuada() + this.getNotaSemestral() + this.notaMonografia) / 3;
    }

    @Override
    public String toString() {
        return super.toString() + " AlunoPos{" + "notaMonografia=" + notaMonografia + '}';
    }
}
