package com.heroku.entity;

import java.io.Serializable;

public class SdaMaSetsubishubetsuKey implements Serializable {
    private String sdaBumoncd;

    private String sdaSetsubishubetsucd;

    private static final long serialVersionUID = 1L;

    public String getSdaBumoncd() {
        return sdaBumoncd;
    }

    public void setSdaBumoncd(String sdaBumoncd) {
        this.sdaBumoncd = sdaBumoncd == null ? null : sdaBumoncd.trim();
    }

    public String getSdaSetsubishubetsucd() {
        return sdaSetsubishubetsucd;
    }

    public void setSdaSetsubishubetsucd(String sdaSetsubishubetsucd) {
        this.sdaSetsubishubetsucd = sdaSetsubishubetsucd == null ? null : sdaSetsubishubetsucd.trim();
    }
}