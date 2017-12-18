package com.heroku.entity;

import java.io.Serializable;
import java.util.Date;

public class SdaMzHan implements Serializable {
    private String sdaHancd;

    private String sdaHannm;

    private String sdaSoshikilevel;

    private String sdaShokubacd;

    private String sdaBumoncd;

    private Integer sdaDisplayno;

    private String sdaMishiyof;

    private String sdaMakeuserid;

    private Date sdaMaketime;

    private String sdaUpdateuserid;

    private Date sdaUpdatetime;

    private String sdaUpdateclient;

    private static final long serialVersionUID = 1L;

    public String getSdaHancd() {
        return sdaHancd;
    }

    public void setSdaHancd(String sdaHancd) {
        this.sdaHancd = sdaHancd == null ? null : sdaHancd.trim();
    }

    public String getSdaHannm() {
        return sdaHannm;
    }

    public void setSdaHannm(String sdaHannm) {
        this.sdaHannm = sdaHannm == null ? null : sdaHannm.trim();
    }

    public String getSdaSoshikilevel() {
        return sdaSoshikilevel;
    }

    public void setSdaSoshikilevel(String sdaSoshikilevel) {
        this.sdaSoshikilevel = sdaSoshikilevel == null ? null : sdaSoshikilevel.trim();
    }

    public String getSdaShokubacd() {
        return sdaShokubacd;
    }

    public void setSdaShokubacd(String sdaShokubacd) {
        this.sdaShokubacd = sdaShokubacd == null ? null : sdaShokubacd.trim();
    }

    public String getSdaBumoncd() {
        return sdaBumoncd;
    }

    public void setSdaBumoncd(String sdaBumoncd) {
        this.sdaBumoncd = sdaBumoncd == null ? null : sdaBumoncd.trim();
    }

    public Integer getSdaDisplayno() {
        return sdaDisplayno;
    }

    public void setSdaDisplayno(Integer sdaDisplayno) {
        this.sdaDisplayno = sdaDisplayno;
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