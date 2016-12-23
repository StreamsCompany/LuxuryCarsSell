package com.xishui.carsell.entity;

public class Brand {
    private Integer brandid;

    private String brandname;

    private Integer counid;

    public Integer getBrandid() {
        return brandid;
    }

    public void setBrandid(Integer brandid) {
        this.brandid = brandid;
    }

    public String getBrandname() {
        return brandname;
    }

    public void setBrandname(String brandname) {
        this.brandname = brandname == null ? null : brandname.trim();
    }

    public Integer getCounid() {
        return counid;
    }

    public void setCounid(Integer counid) {
        this.counid = counid;
    }
}