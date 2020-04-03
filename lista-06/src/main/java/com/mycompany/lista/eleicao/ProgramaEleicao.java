package com.mycompany.lista.eleicao;

import java.util.Random;

public class ProgramaEleicao {
    
    public static void main(String[] args) {
        UrnaEletronica urna = new UrnaEletronica();
        Random random = new Random();
        
        System.out.println("Começou a eleição:");
        
        for (Integer i = 0; i < 10; i++) {
            Integer votos1 = random.nextInt(5);
            Integer votos2 = random.nextInt(5);
            
            for(Integer x = 0; x < votos1; x++)
                urna.votarCandidato1();
            
            for(Integer x = 0; x < votos2; x++)
                urna.votarCandidato2();
            
            System.out.print("\nCandidato 1 recebeu " + votos1);
            System.out.println(" votos, totalizando: " + urna.getTotalCandidato1());
            
            System.out.print("Candidato 2 recebeu " + votos2);
            System.out.println(" votos, totalizando: " + urna.getTotalCandidato2());
        }
        
        System.out.println("Eleição encerradas!");
        System.out.println("----------------------------------");
        System.out.println("Total de votos: " + urna.getTotalVotos());
        
        if (urna.getTotalCandidato1() > urna.getTotalCandidato2()) {
            System.out.println("Resultado: Candidato 1 venceu");
        }
        else if (urna.getTotalCandidato2() > urna.getTotalCandidato1()) {
            System.out.println("Resultado: Candidato 2 venceu");
        }
        else {
            System.out.println("Resultado: Empate");
        }
    }
}
