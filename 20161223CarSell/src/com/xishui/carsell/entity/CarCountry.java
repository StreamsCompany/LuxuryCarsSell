package com.xishui.carsell.entity;

public class CarCountry {
    private Integer counid;

    private String counname;

    public Integer getCounid() {
        return counid;
    }

    public void setCounid(Integer counid) {
        this.counid = counid;
    }

    public String getCounname() {
        return counname;
    }

    public void setCounname(String counname) {
        this.counname = counname == null ? null : counname.trim();
    }
}