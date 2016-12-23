package com.xishui.carsell.entity;

public class GoodsType {
    private Integer goodstypeid;

    private String goodstypename;

    private Integer goodstypebtid;

    public Integer getGoodstypeid() {
        return goodstypeid;
    }

    public void setGoodstypeid(Integer goodstypeid) {
        this.goodstypeid = goodstypeid;
    }

    public String getGoodstypename() {
        return goodstypename;
    }

    public void setGoodstypename(String goodstypename) {
        this.goodstypename = goodstypename == null ? null : goodstypename.trim();
    }

    public Integer getGoodstypebtid() {
        return goodstypebtid;
    }

    public void setGoodstypebtid(Integer goodstypebtid) {
        this.goodstypebtid = goodstypebtid;
    }
}