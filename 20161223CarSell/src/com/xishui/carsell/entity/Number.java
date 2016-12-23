package com.xishui.carsell.entity;

import java.math.BigDecimal;

public class Number {
    private Integer numid;

    private Integer seriesid;

    private String numname;

    private BigDecimal price;

    public Integer getNumid() {
        return numid;
    }

    public void setNumid(Integer numid) {
        this.numid = numid;
    }

    public Integer getSeriesid() {
        return seriesid;
    }

    public void setSeriesid(Integer seriesid) {
        this.seriesid = seriesid;
    }

    public String getNumname() {
        return numname;
    }

    public void setNumname(String numname) {
        this.numname = numname == null ? null : numname.trim();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}