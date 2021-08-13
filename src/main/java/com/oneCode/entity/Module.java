package com.oneCode.entity;

import java.util.Date;

public class Module {
    private Integer cId;

    private String cModuleName;

    private Byte cType;

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

    public String getcModuleName() {
        return cModuleName;
    }

    public void setcModuleName(String cModuleName) {
        this.cModuleName = cModuleName == null ? null : cModuleName.trim();
    }

    public Byte getcType() {
        return cType;
    }

    public void setcType(Byte cType) {
        this.cType = cType;
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