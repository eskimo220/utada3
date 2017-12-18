package com.heroku.entity;

import java.io.Serializable;
import java.util.Date;

public class UserMaster implements Serializable {
    private String username;

    private String name;

    private String passwd;

    private Date tick;

    private static final long serialVersionUID = 1L;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd == null ? null : passwd.trim();
    }

    public Date getTick() {
        return tick;
    }

    public void setTick(Date tick) {
        this.tick = tick;
    }
}