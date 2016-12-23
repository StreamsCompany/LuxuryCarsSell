package com.xishui.carsell.entity;

public class Receiver {
    private Integer receiverid;

    private Integer userid;

    private String receivername;

    private Integer receiversex;

    private String receiveraddress;

    private Integer receivercode;

    private String receivertel;

    private String receiveremail;

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

    public String getReceivername() {
        return receivername;
    }

    public void setReceivername(String receivername) {
        this.receivername = receivername == null ? null : receivername.trim();
    }

    public Integer getReceiversex() {
        return receiversex;
    }

    public void setReceiversex(Integer receiversex) {
        this.receiversex = receiversex;
    }

    public String getReceiveraddress() {
        return receiveraddress;
    }

    public void setReceiveraddress(String receiveraddress) {
        this.receiveraddress = receiveraddress == null ? null : receiveraddress.trim();
    }

    public Integer getReceivercode() {
        return receivercode;
    }

    public void setReceivercode(Integer receivercode) {
        this.receivercode = receivercode;
    }

    public String getReceivertel() {
        return receivertel;
    }

    public void setReceivertel(String receivertel) {
        this.receivertel = receivertel == null ? null : receivertel.trim();
    }

    public String getReceiveremail() {
        return receiveremail;
    }

    public void setReceiveremail(String receiveremail) {
        this.receiveremail = receiveremail == null ? null : receiveremail.trim();
    }
}