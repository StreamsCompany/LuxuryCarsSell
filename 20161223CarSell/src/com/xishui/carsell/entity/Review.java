package com.xishui.carsell.entity;

import java.util.Date;

public class Review {
    private Integer reviewid;

    private Integer goodsid;

    private Integer userid;

    private String reviewtext;

    private String reviewpicurl;

    private Date reviewtime;

    public Integer getReviewid() {
        return reviewid;
    }

    public void setReviewid(Integer reviewid) {
        this.reviewid = reviewid;
    }

    public Integer getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(Integer goodsid) {
        this.goodsid = goodsid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getReviewtext() {
        return reviewtext;
    }

    public void setReviewtext(String reviewtext) {
        this.reviewtext = reviewtext == null ? null : reviewtext.trim();
    }

    public String getReviewpicurl() {
        return reviewpicurl;
    }

    public void setReviewpicurl(String reviewpicurl) {
        this.reviewpicurl = reviewpicurl == null ? null : reviewpicurl.trim();
    }

    public Date getReviewtime() {
        return reviewtime;
    }

    public void setReviewtime(Date reviewtime) {
        this.reviewtime = reviewtime;
    }
}