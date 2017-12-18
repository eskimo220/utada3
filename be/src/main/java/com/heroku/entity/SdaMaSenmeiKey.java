package com.heroku.entity;

import java.io.Serializable;

public class SdaMaSenmeiKey implements Serializable {
    private String sdaBumoncd;

    private String sdaSenmeicd;

    private static final long serialVersionUID = 1L;

    public String getSdaBumoncd() {
        return sdaBumoncd;
    }

    public void setSdaBumoncd(String sdaBumoncd) {
        this.sdaBumoncd = sdaBumoncd == null ? null : sdaBumoncd.trim();
    }

    public String getSdaSenmeicd() {
        return sdaSenmeicd;
    }

    public void setSdaSenmeicd(String sdaSenmeicd) {
        this.sdaSenmeicd = sdaSenmeicd == null ? null : sdaSenmeicd.trim();
    }
}