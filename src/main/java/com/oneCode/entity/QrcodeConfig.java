package com.oneCode.entity;

import java.util.Date;

public class QrcodeConfig {
    private Integer cId;

    private Integer cQrCodeId;

    private Integer cModuleId;

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

    public Integer getcQrCodeId() {
        return cQrCodeId;
    }

    public void setcQrCodeId(Integer cQrCodeId) {
        this.cQrCodeId = cQrCodeId;
    }

    public Integer getcModuleId() {
        return cModuleId;
    }

    public void setcModuleId(Integer cModuleId) {
        this.cModuleId = cModuleId;
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