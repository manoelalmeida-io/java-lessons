package com.mycompany.teste.jdbc;

import org.springframework.jdbc.core.JdbcTemplate;

import java.time.LocalDateTime;
import java.util.List;

public class ProgramaLeitura {

    public static void main(String[] args) {
        ConexaoDados con = new ConexaoDados();
        JdbcTemplate template = new JdbcTemplate(con.getDataSource());

        template.update("INSERT INTO LEITURA (ORIGEM, VALOR, DATA_HORA) VALUES (?, ?, ?)",
                "CPU", 100, LocalDateTime.now());
        template.update("INSERT INTO LEITURA (ORIGEM, VALOR, DATA_HORA) VALUES (?, ?, ?)",
                "RAM", 50, LocalDateTime.now());
        template.update("INSERT INTO LEITURA (ORIGEM, VALOR, DATA_HORA) VALUES (?, ?, ?)",
                "HD", 25, LocalDateTime.now());

        template.update("DELETE FROM leitura WHERE ORIGEM = ?", "CPU");

        List todasOcorrencias = template.queryForList("SELECT * FROM leitura");
        System.out.println(todasOcorrencias);

        List somenteRam = template.queryForList("SELECT * FROM leitura WHERE ORIGEM = ?", "RAM");
        System.out.println(somenteRam);

        System.out.println("Deletando informações da tabela");
        template.execute("TRUNCATE TABLE leitura");
        todasOcorrencias = template.queryForList("SELECT * FROM leitura");
        System.out.println(todasOcorrencias);
    }
}
