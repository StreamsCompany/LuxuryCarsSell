package com.xishui.carsell.entity;

public class Mft {
    private Integer mftid;

    private String mftname;

    private String mftaddress;

    private String mfttel;

    private String mftcomment;

    public Integer getMftid() {
        return mftid;
    }

    public void setMftid(Integer mftid) {
        this.mftid = mftid;
    }

    public String getMftname() {
        return mftname;
    }

    public void setMftname(String mftname) {
        this.mftname = mftname == null ? null : mftname.trim();
    }

    public String getMftaddress() {
        return mftaddress;
    }

    public void setMftaddress(String mftaddress) {
        this.mftaddress = mftaddress == null ? null : mftaddress.trim();
    }

    public String getMfttel() {
        return mfttel;
    }

    public void setMfttel(String mfttel) {
        this.mfttel = mfttel == null ? null : mfttel.trim();
    }

    public String getMftcomment() {
        return mftcomment;
    }

    public void setMftcomment(String mftcomment) {
        this.mftcomment = mftcomment == null ? null : mftcomment.trim();
    }
}