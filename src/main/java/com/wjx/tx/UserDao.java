package com.wjx.tx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public class UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void insert(){
        String sql = "insert into employee (name, age) values (?, ?)";
        jdbcTemplate.update(sql, UUID.randomUUID().toString().substring(0,5), 20);
        int a = 1/0;
    }

}
