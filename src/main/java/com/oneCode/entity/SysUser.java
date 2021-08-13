package com.oneCode.entity;

import java.util.Date;

public class SysUser {
    private Integer cId;

    private String cUsername;

    private String cPassword;

    private Byte cDeleted;

    private Date cCreateTime;

    private Date cUpdateTime;

    private String cUpdateUser;

    private String cCreateUser;

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public String getcUsername() {
        return cUsername;
    }

    public void setcUsername(String cUsername) {
        this.cUsername = cUsername == null ? null : cUsername.trim();
    }

    public String getcPassword() {
        return cPassword;
    }

    public void setcPassword(String cPassword) {
        this.cPassword = cPassword == null ? null : cPassword.trim();
    }

    public Byte getcDeleted() {
        return cDeleted;
    }

    public void setcDeleted(Byte cDeleted) {
        this.cDeleted = cDeleted;
    }

    public Date getcCreateTime() {
        return cCreateTime;
    }

    public void setcCreateTime(Date cCreateTime) {
        this.cCreateTime = cCreateTime;
    }

    public Date getcUpdateTime() {
        return cUpdateTime;
    }

    public void setcUpdateTime(Date cUpdateTime) {
        this.cUpdateTime = cUpdateTime;
    }

    public String getcUpdateUser() {
        return cUpdateUser;
    }

    public void setcUpdateUser(String cUpdateUser) {
        this.cUpdateUser = cUpdateUser == null ? null : cUpdateUser.trim();
    }

    public String getcCreateUser() {
        return cCreateUser;
    }

    public void setcCreateUser(String cCreateUser) {
        this.cCreateUser = cCreateUser == null ? null : cCreateUser.trim();
    }
}