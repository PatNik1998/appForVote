package com.patnik.controller;

import com.google.gson.Gson;
import com.patnik.model.VoteUser;
import com.patnik.service.VoteUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class VoteUserController {

    @Autowired
    private VoteUserService userService;
    

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public VoteUser registerUser(@RequestBody VoteUser voteUser ){

        return userService.addVoteUser(voteUser);
    }
}
