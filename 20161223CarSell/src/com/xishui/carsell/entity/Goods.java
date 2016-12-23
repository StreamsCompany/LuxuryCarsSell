package com.xishui.carsell.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Goods {
    private Integer goodsid;

    private String goodsname;

    private BigDecimal goodsmrtprice;

    private BigDecimal goodsmemprice;

    private BigDecimal goodsdiscount;

    private String goodsdsc;

    private Integer goodscolor;

    private Integer goodsformatid;

    private Integer goodssellerid;

    private Integer mftid;

    private String goodspicurl;

    private Integer goodsnum;

    private Integer goodstypeid;

    private Integer goodscmt;

    private Date goodsuploadtime;

    private Integer goodssellcount;

    private Integer goodshotsell;

    private Integer goodsgroupbuy;

    private Integer goodsrecommend;

    public Integer getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(Integer goodsid) {
        this.goodsid = goodsid;
    }

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname == null ? null : goodsname.trim();
    }

    public BigDecimal getGoodsmrtprice() {
        return goodsmrtprice;
    }

    public void setGoodsmrtprice(BigDecimal goodsmrtprice) {
        this.goodsmrtprice = goodsmrtprice;
    }

    public BigDecimal getGoodsmemprice() {
        return goodsmemprice;
    }

    public void setGoodsmemprice(BigDecimal goodsmemprice) {
        this.goodsmemprice = goodsmemprice;
    }

    public BigDecimal getGoodsdiscount() {
        return goodsdiscount;
    }

    public void setGoodsdiscount(BigDecimal goodsdiscount) {
        this.goodsdiscount = goodsdiscount;
    }

    public String getGoodsdsc() {
        return goodsdsc;
    }

    public void setGoodsdsc(String goodsdsc) {
        this.goodsdsc = goodsdsc == null ? null : goodsdsc.trim();
    }

    public Integer getGoodscolor() {
        return goodscolor;
    }

    public void setGoodscolor(Integer goodscolor) {
        this.goodscolor = goodscolor;
    }

    public Integer getGoodsformatid() {
        return goodsformatid;
    }

    public void setGoodsformatid(Integer goodsformatid) {
        this.goodsformatid = goodsformatid;
    }

    public Integer getGoodssellerid() {
        return goodssellerid;
    }

    public void setGoodssellerid(Integer goodssellerid) {
        this.goodssellerid = goodssellerid;
    }

    public Integer getMftid() {
        return mftid;
    }

    public void setMftid(Integer mftid) {
        this.mftid = mftid;
    }

    public String getGoodspicurl() {
        return goodspicurl;
    }

    public void setGoodspicurl(String goodspicurl) {
        this.goodspicurl = goodspicurl == null ? null : goodspicurl.trim();
    }

    public Integer getGoodsnum() {
        return goodsnum;
    }

    public void setGoodsnum(Integer goodsnum) {
        this.goodsnum = goodsnum;
    }

    public Integer getGoodstypeid() {
        return goodstypeid;
    }

    public void setGoodstypeid(Integer goodstypeid) {
        this.goodstypeid = goodstypeid;
    }

    public Integer getGoodscmt() {
        return goodscmt;
    }

    public void setGoodscmt(Integer goodscmt) {
        this.goodscmt = goodscmt;
    }

    public Date getGoodsuploadtime() {
        return goodsuploadtime;
    }

    public void setGoodsuploadtime(Date goodsuploadtime) {
        this.goodsuploadtime = goodsuploadtime;
    }

    public Integer getGoodssellcount() {
        return goodssellcount;
    }

    public void setGoodssellcount(Integer goodssellcount) {
        this.goodssellcount = goodssellcount;
    }

    public Integer getGoodshotsell() {
        return goodshotsell;
    }

    public void setGoodshotsell(Integer goodshotsell) {
        this.goodshotsell = goodshotsell;
    }

    public Integer getGoodsgroupbuy() {
        return goodsgroupbuy;
    }

    public void setGoodsgroupbuy(Integer goodsgroupbuy) {
        this.goodsgroupbuy = goodsgroupbuy;
    }

    public Integer getGoodsrecommend() {
        return goodsrecommend;
    }

    public void setGoodsrecommend(Integer goodsrecommend) {
        this.goodsrecommend = goodsrecommend;
    }
}