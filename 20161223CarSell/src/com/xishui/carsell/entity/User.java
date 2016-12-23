package com.xishui.carsell.entity;

public class User {
    private Integer userid;

    private String usernickname;

    private String username;

    private Integer usersex;

    private String userpsd;

    private String usetel;

    private String useraddress;

    private Integer useremail;

    private String userpoints;

    private Integer userlevel;

    private Integer userstate;

    private String usercardid;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsernickname() {
        return usernickname;
    }

    public void setUsernickname(String usernickname) {
        this.usernickname = usernickname == null ? null : usernickname.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public Integer getUsersex() {
        return usersex;
    }

    public void setUsersex(Integer usersex) {
        this.usersex = usersex;
    }

    public String getUserpsd() {
        return userpsd;
    }

    public void setUserpsd(String userpsd) {
        this.userpsd = userpsd == null ? null : userpsd.trim();
    }

    public String getUsetel() {
        return usetel;
    }

    public void setUsetel(String usetel) {
        this.usetel = usetel == null ? null : usetel.trim();
    }

    public String getUseraddress() {
        return useraddress;
    }

    public void setUseraddress(String useraddress) {
        this.useraddress = useraddress == null ? null : useraddress.trim();
    }

    public Integer getUseremail() {
        return useremail;
    }

    public void setUseremail(Integer useremail) {
        this.useremail = useremail;
    }

    public String getUserpoints() {
        return userpoints;
    }

    public void setUserpoints(String userpoints) {
        this.userpoints = userpoints == null ? null : userpoints.trim();
    }

    public Integer getUserlevel() {
        return userlevel;
    }

    public void setUserlevel(Integer userlevel) {
        this.userlevel = userlevel;
    }

    public Integer getUserstate() {
        return userstate;
    }

    public void setUserstate(Integer userstate) {
        this.userstate = userstate;
    }

    public String getUsercardid() {
        return usercardid;
    }

    public void setUsercardid(String usercardid) {
        this.usercardid = usercardid == null ? null : usercardid.trim();
    }
}