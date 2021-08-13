package com.oneCode.entity;

public class QrcodeConfigWithBLOBs extends QrcodeConfig {
    private String cData;

    private String cConfig;

    public String getcData() {
        return cData;
    }

    public void setcData(String cData) {
        this.cData = cData == null ? null : cData.trim();
    }

    public String getcConfig() {
        return cConfig;
    }

    public void setcConfig(String cConfig) {
        this.cConfig = cConfig == null ? null : cConfig.trim();
    }
}