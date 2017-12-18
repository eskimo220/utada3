package com.heroku.entity;

import java.io.Serializable;

public class SdaMbKensashubetsuKey implements Serializable {
    private String sdaBumoncd;

    private Integer sdaKensashubetsucd;

    private static final long serialVersionUID = 1L;

    public String getSdaBumoncd() {
        return sdaBumoncd;
    }

    public void setSdaBumoncd(String sdaBumoncd) {
        this.sdaBumoncd = sdaBumoncd == null ? null : sdaBumoncd.trim();
    }

    public Integer getSdaKensashubetsucd() {
        return sdaKensashubetsucd;
    }

    public void setSdaKensashubetsucd(Integer sdaKensashubetsucd) {
        this.sdaKensashubetsucd = sdaKensashubetsucd;
    }
}