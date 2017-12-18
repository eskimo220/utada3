package com.heroku.entity;

import java.io.Serializable;
import java.util.Date;

public class Ticks implements Serializable {
    private Date tick;

    private static final long serialVersionUID = 1L;

    public Date getTick() {
        return tick;
    }

    public void setTick(Date tick) {
        this.tick = tick;
    }
}