package com.patnik.dao;

import com.patnik.model.VoteUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class VoteUserDaoImpl implements VoteUserDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;


    public VoteUser addUser(VoteUser voteUser) {
        String sql = "insert into VoteUser (lastname, phone) values(?,?)";
        jdbcTemplate.update(sql,voteUser.getLastName(),voteUser.getPhone());
        return voteUser;
    }
}
