package com.pochit.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

/**
 * Created by emilianoalbiani on 4/27/17.
 */
public class ConfigJDBCTemplate implements ConfigDAO {
    private DataSource dataSource;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public Config getConfig(String firstName) {
        final JdbcTemplate jdbcTemplateObject = new JdbcTemplate(dataSource);
        String SQL = "select * from config where FIRST_NAME = ?";
        Config config = jdbcTemplateObject.queryForObject(SQL, new Object[]{firstName}, new ConfigMapper());
        return config;
    }
}
