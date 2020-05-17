package com.patnik.service;

import com.patnik.dao.VoteUserDao;
import com.patnik.model.VoteUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VoteUserService {


    private VoteUserDao userDao;

    @Autowired
    public VoteUserService(VoteUserDao userDao){
        this.userDao = userDao;
    }

    public VoteUser addVoteUser(VoteUser voteUser){
        return userDao.addUser(voteUser);
    }
}
