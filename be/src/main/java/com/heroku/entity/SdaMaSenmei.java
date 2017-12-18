package com.heroku.entity;

import java.io.Serializable;
import java.util.Date;

public class SdaMaSenmei extends SdaMaSenmeiKey implements Serializable {
    private String sdaSenmeinm;

    private Integer sdaDisplayno;

    private String sdaMishiyof;

    private String sdaMakeuserid;

    private Date sdaMaketime;

    private String sdaUpdateuserid;

    private Date sdaUpdatetime;

    private String sdaUpdateclient;

    private static final long serialVersionUID = 1L;

    public String getSdaSenmeinm() {
        return sdaSenmeinm;
    }

    public void setSdaSenmeinm(String sdaSenmeinm) {
        this.sdaSenmeinm = sdaSenmeinm == null ? null : sdaSenmeinm.trim();
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