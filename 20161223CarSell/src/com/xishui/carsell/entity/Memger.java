package com.xishui.carsell.entity;

public class Memger {
    private Integer managerid;

    private String managername;

    private String managerpsd;

    private String managertel;

    private Integer managerlevel;

    private Integer managerstate;

    private Integer managerdptment;

    public Integer getManagerid() {
        return managerid;
    }

    public void setManagerid(Integer managerid) {
        this.managerid = managerid;
    }

    public String getManagername() {
        return managername;
    }

    public void setManagername(String managername) {
        this.managername = managername == null ? null : managername.trim();
    }

    public String getManagerpsd() {
        return managerpsd;
    }

    public void setManagerpsd(String managerpsd) {
        this.managerpsd = managerpsd == null ? null : managerpsd.trim();
    }

    public String getManagertel() {
        return managertel;
    }

    public void setManagertel(String managertel) {
        this.managertel = managertel == null ? null : managertel.trim();
    }

    public Integer getManagerlevel() {
        return managerlevel;
    }

    public void setManagerlevel(Integer managerlevel) {
        this.managerlevel = managerlevel;
    }

    public Integer getManagerstate() {
        return managerstate;
    }

    public void setManagerstate(Integer managerstate) {
        this.managerstate = managerstate;
    }

    public Integer getManagerdptment() {
        return managerdptment;
    }

    public void setManagerdptment(Integer managerdptment) {
        this.managerdptment = managerdptment;
    }
}