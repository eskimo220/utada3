package com.heroku.entity;

import java.io.Serializable;
import java.util.Date;

public class SdaMbKensashubetsu extends SdaMbKensashubetsuKey implements Serializable {
    private String sdaSetsubishubetsucd;

    private String sdaSetsubishosaicd;

    private String sdaKensashubetsunm;

    private Integer sdaShanaishuki;

    private Integer sdaHoteishuki;

    private Integer sdaDisplayno;

    private String sdaMishiyof;

    private String sdaMakeuserid;

    private Date sdaMaketime;

    private String sdaUpdateuserid;

    private Date sdaUpdatetime;

    private String sdaUpdateclient;

    private static final long serialVersionUID = 1L;

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

    public String getSdaKensashubetsunm() {
        return sdaKensashubetsunm;
    }

    public void setSdaKensashubetsunm(String sdaKensashubetsunm) {
        this.sdaKensashubetsunm = sdaKensashubetsunm == null ? null : sdaKensashubetsunm.trim();
    }

    public Integer getSdaShanaishuki() {
        return sdaShanaishuki;
    }

    public void setSdaShanaishuki(Integer sdaShanaishuki) {
        this.sdaShanaishuki = sdaShanaishuki;
    }

    public Integer getSdaHoteishuki() {
        return sdaHoteishuki;
    }

    public void setSdaHoteishuki(Integer sdaHoteishuki) {
        this.sdaHoteishuki = sdaHoteishuki;
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