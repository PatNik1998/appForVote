package com.patnik.model;

import java.io.Serializable;
import java.util.Date;

public class VoteUser implements Serializable {
    private int voteUserId;
    private String lastName;

    private String phone;

    public VoteUser(String lastName, String phone) {
        this.lastName = lastName;
        this.phone = phone;
    }

    public VoteUser(int voteUserId, String lastName, String phone) {
        this.voteUserId = voteUserId;
        this.lastName = lastName;
        this.phone = phone;
    }

    public VoteUser() {

    }

    public int getVoteUserId() {
        return voteUserId;
    }

    public void setVoteUserId(int voteUserId) {
        this.voteUserId = voteUserId;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
