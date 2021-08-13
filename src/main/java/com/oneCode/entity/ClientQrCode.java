package com.oneCode.entity;

import java.util.Date;

public class ClientQrCode {
    private Integer cId;

    private Integer cClientId;

    private String cUrl;

    private Integer cExpire;

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

    public Integer getcClientId() {
        return cClientId;
    }

    public void setcClientId(Integer cClientId) {
        this.cClientId = cClientId;
    }

    public String getcUrl() {
        return cUrl;
    }

    public void setcUrl(String cUrl) {
        this.cUrl = cUrl == null ? null : cUrl.trim();
    }

    public Integer getcExpire() {
        return cExpire;
    }

    public void setcExpire(Integer cExpire) {
        this.cExpire = cExpire;
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