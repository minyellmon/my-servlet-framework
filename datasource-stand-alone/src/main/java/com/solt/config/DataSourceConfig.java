package com.solt.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabase;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;

import javax.sql.DataSource;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.logging.Logger;

@Configuration
public class DataSourceConfig {
    @Bean
    public DataSource dataSource() {

        return new EmbeddedDatabaseBuilder().addScript("Schema.sql").addScript("data.sql").setScriptEncoding("UTF-8")
                .generateUniqueName(true).build();




    }


}
