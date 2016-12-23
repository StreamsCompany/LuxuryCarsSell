package com.xishui.carsell.entity;

import java.util.Date;

public class Auction {
    private Integer auctionid;

    private Integer sellid;

    private Date selldate;

    private Integer userid;

    public Integer getAuctionid() {
        return auctionid;
    }

    public void setAuctionid(Integer auctionid) {
        this.auctionid = auctionid;
    }

    public Integer getSellid() {
        return sellid;
    }

    public void setSellid(Integer sellid) {
        this.sellid = sellid;
    }

    public Date getSelldate() {
        return selldate;
    }

    public void setSelldate(Date selldate) {
        this.selldate = selldate;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }
}