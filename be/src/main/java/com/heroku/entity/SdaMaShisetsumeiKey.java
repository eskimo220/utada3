package com.heroku.entity;

import java.io.Serializable;

public class SdaMaShisetsumeiKey implements Serializable {
    private String sdaBumoncd;

    private String sdaSenmeicd;

    private String sdaShisetsucd;

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

    public String getSdaShisetsucd() {
        return sdaShisetsucd;
    }

    public void setSdaShisetsucd(String sdaShisetsucd) {
        this.sdaShisetsucd = sdaShisetsucd == null ? null : sdaShisetsucd.trim();
    }
}