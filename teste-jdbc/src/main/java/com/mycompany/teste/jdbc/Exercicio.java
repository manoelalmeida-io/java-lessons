package com.mycompany.teste.jdbc;

import org.springframework.jdbc.core.JdbcTemplate;

import java.time.LocalDateTime;
import java.util.Random;

public class Exercicio {

    public static void main(String[] args) {
        ConexaoDados con = new ConexaoDados();
        JdbcTemplate template = new JdbcTemplate(con.getDataSource());

        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            template.update("INSERT INTO LEITURA (ORIGEM, VALOR, DATA_HORA) VALUES (?, ?, ?)",
                    "CPU", random.nextInt(101), LocalDateTime.now());
            template.update("INSERT INTO LEITURA (ORIGEM, VALOR, DATA_HORA) VALUES (?, ?, ?)",
                    "RAM", random.nextInt(101), LocalDateTime.now());
            template.update("INSERT INTO LEITURA (ORIGEM, VALOR, DATA_HORA) VALUES (?, ?, ?)",
                    "HD", random.nextInt(101), LocalDateTime.now());
        }

        template.queryForList("SELECT * FROM LEITURA").forEach(System.out::println);
        template.execute("TRUNCATE TABLE LEITURA");
    }
}
