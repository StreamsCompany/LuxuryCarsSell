package com.xishui.carsell.entity;

public class Seat {
    private Integer seatid;

    private String seatname;

    public Integer getSeatid() {
        return seatid;
    }

    public void setSeatid(Integer seatid) {
        this.seatid = seatid;
    }

    public String getSeatname() {
        return seatname;
    }

    public void setSeatname(String seatname) {
        this.seatname = seatname == null ? null : seatname.trim();
    }
}