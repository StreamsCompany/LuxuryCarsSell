package com.xishui.carsell.entity;

public class GoodsSeller {
    private Integer goodssellerid;

    private String goodssellername;

    private String goodsselleraddress;

    private String goodssellertel;

    public Integer getGoodssellerid() {
        return goodssellerid;
    }

    public void setGoodssellerid(Integer goodssellerid) {
        this.goodssellerid = goodssellerid;
    }

    public String getGoodssellername() {
        return goodssellername;
    }

    public void setGoodssellername(String goodssellername) {
        this.goodssellername = goodssellername == null ? null : goodssellername.trim();
    }

    public String getGoodsselleraddress() {
        return goodsselleraddress;
    }

    public void setGoodsselleraddress(String goodsselleraddress) {
        this.goodsselleraddress = goodsselleraddress == null ? null : goodsselleraddress.trim();
    }

    public String getGoodssellertel() {
        return goodssellertel;
    }

    public void setGoodssellertel(String goodssellertel) {
        this.goodssellertel = goodssellertel == null ? null : goodssellertel.trim();
    }
}