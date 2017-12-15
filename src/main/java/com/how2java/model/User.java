package com.how2java.model;

public class User {
    private int userid;
    private String username;
    private String userphone;
    private String userpwd;
    private String userrole;
    private Role userrolename;

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserphone() {
        return userphone;
    }

    public void setUserphone(String userphone) {
        this.userphone = userphone;
    }

    public String getUserpwd() {
        return userpwd;
    }

    public void setUserpwd(String userpwd) {
        this.userpwd = userpwd;
    }

    public String getUserrole() {
        return userrole;
    }

    public void setUserrole(String userrole) {
        this.userrole = userrole;
    }

    public Role getUserrolename() {
        return userrolename;
    }

    public void setUserrolename(Role userrolename) {
        this.userrolename = userrolename;
    }
}
