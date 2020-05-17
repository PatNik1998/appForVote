package com.patnik.dao;

import com.patnik.model.VoteUser;
import org.springframework.stereotype.Service;

@Service
public interface VoteUserDao {
    public VoteUser addUser(VoteUser voteUser);
}
