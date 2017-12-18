package com.heroku.entity;

import java.io.Serializable;

public class SdaMaSetsubishosaiKey implements Serializable {
    private String sdaBumoncd;

    private String sdaSetsubishubetsucd;

    private String sdaSetsubishosaicd;

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

    public String getSdaSetsubishosaicd() {
        return sdaSetsubishosaicd;
    }

    public void setSdaSetsubishosaicd(String sdaSetsubishosaicd) {
        this.sdaSetsubishosaicd = sdaSetsubishosaicd == null ? null : sdaSetsubishosaicd.trim();
    }
}