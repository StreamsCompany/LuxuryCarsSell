package com.xishui.carsell.entity;

public class Oil {
    private Integer oilid;

    private String oilname;

    public Integer getOilid() {
        return oilid;
    }

    public void setOilid(Integer oilid) {
        this.oilid = oilid;
    }

    public String getOilname() {
        return oilname;
    }

    public void setOilname(String oilname) {
        this.oilname = oilname == null ? null : oilname.trim();
    }
}