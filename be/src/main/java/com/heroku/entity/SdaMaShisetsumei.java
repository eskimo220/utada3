package com.heroku.entity;

import java.io.Serializable;
import java.util.Date;

public class SdaMaShisetsumei extends SdaMaShisetsumeiKey implements Serializable {
    private String sdaShisetsunm;

    private Integer sdaShisetsuno;

    private String sdaSearchsenmeicd;

    private String sdaSearchshisetsucd;

    private String sdaTasenf;

    private String sdaMishiyof;

    private String sdaMakeuserid;

    private Date sdaMaketime;

    private String sdaUpdateuserid;

    private Date sdaUpdatetime;

    private String sdaUpdateclient;

    private static final long serialVersionUID = 1L;

    public String getSdaShisetsunm() {
        return sdaShisetsunm;
    }

    public void setSdaShisetsunm(String sdaShisetsunm) {
        this.sdaShisetsunm = sdaShisetsunm == null ? null : sdaShisetsunm.trim();
    }

    public Integer getSdaShisetsuno() {
        return sdaShisetsuno;
    }

    public void setSdaShisetsuno(Integer sdaShisetsuno) {
        this.sdaShisetsuno = sdaShisetsuno;
    }

    public String getSdaSearchsenmeicd() {
        return sdaSearchsenmeicd;
    }

    public void setSdaSearchsenmeicd(String sdaSearchsenmeicd) {
        this.sdaSearchsenmeicd = sdaSearchsenmeicd == null ? null : sdaSearchsenmeicd.trim();
    }

    public String getSdaSearchshisetsucd() {
        return sdaSearchshisetsucd;
    }

    public void setSdaSearchshisetsucd(String sdaSearchshisetsucd) {
        this.sdaSearchshisetsucd = sdaSearchshisetsucd == null ? null : sdaSearchshisetsucd.trim();
    }

    public String getSdaTasenf() {
        return sdaTasenf;
    }

    public void setSdaTasenf(String sdaTasenf) {
        this.sdaTasenf = sdaTasenf == null ? null : sdaTasenf.trim();
    }

    public String getSdaMishiyof() {
        return sdaMishiyof;
    }

    public void setSdaMishiyof(String sdaMishiyof) {
        this.sdaMishiyof = sdaMishiyof == null ? null : sdaMishiyof.trim();
    }

    public String getSdaMakeuserid() {
        return sdaMakeuserid;
    }

    public void setSdaMakeuserid(String sdaMakeuserid) {
        this.sdaMakeuserid = sdaMakeuserid == null ? null : sdaMakeuserid.trim();
    }

    public Date getSdaMaketime() {
        return sdaMaketime;
    }

    public void setSdaMaketime(Date sdaMaketime) {
        this.sdaMaketime = sdaMaketime;
    }

    public String getSdaUpdateuserid() {
        return sdaUpdateuserid;
    }

    public void setSdaUpdateuserid(String sdaUpdateuserid) {
        this.sdaUpdateuserid = sdaUpdateuserid == null ? null : sdaUpdateuserid.trim();
    }

    public Date getSdaUpdatetime() {
        return sdaUpdatetime;
    }

    public void setSdaUpdatetime(Date sdaUpdatetime) {
        this.sdaUpdatetime = sdaUpdatetime;
    }

    public String getSdaUpdateclient() {
        return sdaUpdateclient;
    }

    public void setSdaUpdateclient(String sdaUpdateclient) {
        this.sdaUpdateclient = sdaUpdateclient == null ? null : sdaUpdateclient.trim();
    }
}