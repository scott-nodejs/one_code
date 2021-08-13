package com.oneCode.entity;

import java.util.Date;

public class CompanyUser {
    private Integer cId;

    private Integer cCompanyId;

    private String cUsername;

    private String cPassword;

    private String cPhone;

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

    public Integer getcCompanyId() {
        return cCompanyId;
    }

    public void setcCompanyId(Integer cCompanyId) {
        this.cCompanyId = cCompanyId;
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

    public String getcPhone() {
        return cPhone;
    }

    public void setcPhone(String cPhone) {
        this.cPhone = cPhone == null ? null : cPhone.trim();
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