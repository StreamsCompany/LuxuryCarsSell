package com.xishui.carsell.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Sell {
    private Integer sellid;

    private Integer userid;

    private Integer coloid;

    private Integer numid;

    private Integer styleid;

    private Integer seatid;

    private Integer oilid;

    private Integer speedboxid;

    private Integer outid;

    private Date regdate;

    private BigDecimal milieage;

    private BigDecimal factprice;

    private String path;

    public Integer getSellid() {
        return sellid;
    }

    public void setSellid(Integer sellid) {
        this.sellid = sellid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getColoid() {
        return coloid;
    }

    public void setColoid(Integer coloid) {
        this.coloid = coloid;
    }

    public Integer getNumid() {
        return numid;
    }

    public void setNumid(Integer numid) {
        this.numid = numid;
    }

    public Integer getStyleid() {
        return styleid;
    }

    public void setStyleid(Integer styleid) {
        this.styleid = styleid;
    }

    public Integer getSeatid() {
        return seatid;
    }

    public void setSeatid(Integer seatid) {
        this.seatid = seatid;
    }

    public Integer getOilid() {
        return oilid;
    }

    public void setOilid(Integer oilid) {
        this.oilid = oilid;
    }

    public Integer getSpeedboxid() {
        return speedboxid;
    }

    public void setSpeedboxid(Integer speedboxid) {
        this.speedboxid = speedboxid;
    }

    public Integer getOutid() {
        return outid;
    }

    public void setOutid(Integer outid) {
        this.outid = outid;
    }

    public Date getRegdate() {
        return regdate;
    }

    public void setRegdate(Date regdate) {
        this.regdate = regdate;
    }

    public BigDecimal getMilieage() {
        return milieage;
    }

    public void setMilieage(BigDecimal milieage) {
        this.milieage = milieage;
    }

    public BigDecimal getFactprice() {
        return factprice;
    }

    public void setFactprice(BigDecimal factprice) {
        this.factprice = factprice;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path == null ? null : path.trim();
    }
}