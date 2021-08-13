package com.oneCode.entity;

import java.util.Date;

public class Company {
    private Integer cId;

    private String cCompanyName;

    private String cLogo;

    private Byte cDeleted;

    private Date cCreateTime;

    private Date cUpdateTime;

    private String cCreateUser;

    private String cUpdateUser;

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public String getcCompanyName() {
        return cCompanyName;
    }

    public void setcCompanyName(String cCompanyName) {
        this.cCompanyName = cCompanyName == null ? null : cCompanyName.trim();
    }

    public String getcLogo() {
        return cLogo;
    }

    public void setcLogo(String cLogo) {
        this.cLogo = cLogo == null ? null : cLogo.trim();
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

    public String getcCreateUser() {
        return cCreateUser;
    }

    public void setcCreateUser(String cCreateUser) {
        this.cCreateUser = cCreateUser == null ? null : cCreateUser.trim();
    }

    public String getcUpdateUser() {
        return cUpdateUser;
    }

    public void setcUpdateUser(String cUpdateUser) {
        this.cUpdateUser = cUpdateUser == null ? null : cUpdateUser.trim();
    }
}