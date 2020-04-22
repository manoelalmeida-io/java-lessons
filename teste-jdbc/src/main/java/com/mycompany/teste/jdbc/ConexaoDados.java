package com.mycompany.teste.jdbc;

import org.apache.commons.dbcp2.BasicDataSource;

public class ConexaoDados {

    private BasicDataSource dataSource;

    public ConexaoDados() {
        this.dataSource = new BasicDataSource();
        this.dataSource.setDriverClassName("org.h2.Driver");
        this.dataSource.setUrl("jdbc:h2:file:~/testdb");
        this.dataSource.setUsername("sa");
        this.dataSource.setPassword("");
    }

    public BasicDataSource getDataSource() {
        return dataSource;
    }
}
