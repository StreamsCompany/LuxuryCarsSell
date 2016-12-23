package com.xishui.carsell.entity;

public class CarColor {
    private Integer coloid;

    private String colorname;

    public Integer getColoid() {
        return coloid;
    }

    public void setColoid(Integer coloid) {
        this.coloid = coloid;
    }

    public String getColorname() {
        return colorname;
    }

    public void setColorname(String colorname) {
        this.colorname = colorname == null ? null : colorname.trim();
    }
}