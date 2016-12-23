package com.xishui.carsell.entity;

public class EmissionStandards {
    private Integer outid;

    private String outname;

    public Integer getOutid() {
        return outid;
    }

    public void setOutid(Integer outid) {
        this.outid = outid;
    }

    public String getOutname() {
        return outname;
    }

    public void setOutname(String outname) {
        this.outname = outname == null ? null : outname.trim();
    }
}