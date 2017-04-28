package com.pochit.dao;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by emilianoalbiani on 4/27/17.
 */
public class ConfigMapper implements RowMapper<Config> {
    public Config mapRow(ResultSet rs, int rowNum) throws SQLException {
        Config config = new Config();
        config.setFirstNanme(rs.getString("FIRST_NAME"));
        config.setToNumber(rs.getInt("TO_NUMBER"));
        return config;
    }
}
