package com.heroku.entity;

import java.io.Serializable;

public class Fortest implements Serializable {
    private String[] first;

    private String second;

    private static final long serialVersionUID = 1L;

    public String[] getFirst() {
        return first;
    }

    public void setFirst(String[] first) {
        this.first = first;
    }

    public String getSecond() {
        return second;
    }

    public void setSecond(String second) {
        this.second = second;
    }
}