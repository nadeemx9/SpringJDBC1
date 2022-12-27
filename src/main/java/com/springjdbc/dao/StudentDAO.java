package com.springjdbc.dao;

import com.springjdbc.pojo.Student;
import org.springframework.jdbc.core.JdbcTemplate;

public class StudentDAO
{

    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate()
    {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate)
    {
        this.jdbcTemplate = jdbcTemplate;
    }

    public int insert(Student student)
    {
        String query = "insert into Student values(?, ?, ?)";
        Object[] args =
        {
            student.getRollno(), student.getName(), student.getCity()
        };

        return jdbcTemplate.update(query, args);
    }
}
