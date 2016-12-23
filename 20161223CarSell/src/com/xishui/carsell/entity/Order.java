package com.xishui.carsell.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Order {
    private Integer orderid;

    private Integer orderstateid;

    private Integer receiverid;

    private Integer userid;

    private Integer payid;

    private Date ordercreattime;

    private Date orderpaytime;

    private Date ordersendtime;

    private Date orderdealtime;

    private BigDecimal ordergoodspaymoney;

    private BigDecimal orderwaybillprice;

    private Integer orderwaybillid;

    private Integer ordergoodssendtype;

    private Integer ordermoneypaytype;

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public Integer getOrderstateid() {
        return orderstateid;
    }

    public void setOrderstateid(Integer orderstateid) {
        this.orderstateid = orderstateid;
    }

    public Integer getReceiverid() {
        return receiverid;
    }

    public void setReceiverid(Integer receiverid) {
        this.receiverid = receiverid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getPayid() {
        return payid;
    }

    public void setPayid(Integer payid) {
        this.payid = payid;
    }

    public Date getOrdercreattime() {
        return ordercreattime;
    }

    public void setOrdercreattime(Date ordercreattime) {
        this.ordercreattime = ordercreattime;
    }

    public Date getOrderpaytime() {
        return orderpaytime;
    }

    public void setOrderpaytime(Date orderpaytime) {
        this.orderpaytime = orderpaytime;
    }

    public Date getOrdersendtime() {
        return ordersendtime;
    }

    public void setOrdersendtime(Date ordersendtime) {
        this.ordersendtime = ordersendtime;
    }

    public Date getOrderdealtime() {
        return orderdealtime;
    }

    public void setOrderdealtime(Date orderdealtime) {
        this.orderdealtime = orderdealtime;
    }

    public BigDecimal getOrdergoodspaymoney() {
        return ordergoodspaymoney;
    }

    public void setOrdergoodspaymoney(BigDecimal ordergoodspaymoney) {
        this.ordergoodspaymoney = ordergoodspaymoney;
    }

    public BigDecimal getOrderwaybillprice() {
        return orderwaybillprice;
    }

    public void setOrderwaybillprice(BigDecimal orderwaybillprice) {
        this.orderwaybillprice = orderwaybillprice;
    }

    public Integer getOrderwaybillid() {
        return orderwaybillid;
    }

    public void setOrderwaybillid(Integer orderwaybillid) {
        this.orderwaybillid = orderwaybillid;
    }

    public Integer getOrdergoodssendtype() {
        return ordergoodssendtype;
    }

    public void setOrdergoodssendtype(Integer ordergoodssendtype) {
        this.ordergoodssendtype = ordergoodssendtype;
    }

    public Integer getOrdermoneypaytype() {
        return ordermoneypaytype;
    }

    public void setOrdermoneypaytype(Integer ordermoneypaytype) {
        this.ordermoneypaytype = ordermoneypaytype;
    }
}