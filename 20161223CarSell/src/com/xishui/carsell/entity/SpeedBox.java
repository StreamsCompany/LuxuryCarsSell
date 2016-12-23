package com.xishui.carsell.entity;

public class SpeedBox {
    private Integer speedboxid;

    private String speedboxname;

    public Integer getSpeedboxid() {
        return speedboxid;
    }

    public void setSpeedboxid(Integer speedboxid) {
        this.speedboxid = speedboxid;
    }

    public String getSpeedboxname() {
        return speedboxname;
    }

    public void setSpeedboxname(String speedboxname) {
        this.speedboxname = speedboxname == null ? null : speedboxname.trim();
    }
}