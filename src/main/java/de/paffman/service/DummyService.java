package de.paffman.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class DummyService {

    @Autowired
    JdbcTemplate jdbcTemplate;


    public Boolean checkId(Integer id) {
        String sql = "SELECT * FROM dummy";

        Boolean result = jdbcTemplate.queryForObject(sql, Boolean.class);
        return result;
    }


}
