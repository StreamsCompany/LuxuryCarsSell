package com.xishui.carsell.entity;

import java.util.Date;

public class CartDsc {
    private Integer cartdscid;

    private Integer userid;

    private Integer cartid;

    private Integer goodsnum;

    private Date cartgooosaddtime;

    public Integer getCartdscid() {
        return cartdscid;
    }

    public void setCartdscid(Integer cartdscid) {
        this.cartdscid = cartdscid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getCartid() {
        return cartid;
    }

    public void setCartid(Integer cartid) {
        this.cartid = cartid;
    }

    public Integer getGoodsnum() {
        return goodsnum;
    }

    public void setGoodsnum(Integer goodsnum) {
        this.goodsnum = goodsnum;
    }

    public Date getCartgooosaddtime() {
        return cartgooosaddtime;
    }

    public void setCartgooosaddtime(Date cartgooosaddtime) {
        this.cartgooosaddtime = cartgooosaddtime;
    }
}