package com.yj.test.entity;

import java.util.Date;

public class TdCommodityAfterServiceRecord {
    private Long id;

    private String orderNo;

    private String usName;

    private String usPhoneNo;

    private String reason;

    private Long commodityCount;

    private Byte status;

    private String checkContent;

    private Date createdAt;

    private Date updatedAt;

    private Date checkedAt;

    private Long storeLoginId;

    private String storeLoginName;

    private Long areaId;

    private String areaName;

    private Long agentId;

    private String agentName;

    private Long storeId;

    private String storeName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    public String getUsName() {
        return usName;
    }

    public void setUsName(String usName) {
        this.usName = usName == null ? null : usName.trim();
    }

    public String getUsPhoneNo() {
        return usPhoneNo;
    }

    public void setUsPhoneNo(String usPhoneNo) {
        this.usPhoneNo = usPhoneNo == null ? null : usPhoneNo.trim();
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }

    public Long getCommodityCount() {
        return commodityCount;
    }

    public void setCommodityCount(Long commodityCount) {
        this.commodityCount = commodityCount;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public String getCheckContent() {
        return checkContent;
    }

    public void setCheckContent(String checkContent) {
        this.checkContent = checkContent == null ? null : checkContent.trim();
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Date getCheckedAt() {
        return checkedAt;
    }

    public void setCheckedAt(Date checkedAt) {
        this.checkedAt = checkedAt;
    }

    public Long getStoreLoginId() {
        return storeLoginId;
    }

    public void setStoreLoginId(Long storeLoginId) {
        this.storeLoginId = storeLoginId;
    }

    public String getStoreLoginName() {
        return storeLoginName;
    }

    public void setStoreLoginName(String storeLoginName) {
        this.storeLoginName = storeLoginName == null ? null : storeLoginName.trim();
    }

    public Long getAreaId() {
        return areaId;
    }

    public void setAreaId(Long areaId) {
        this.areaId = areaId;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName == null ? null : areaName.trim();
    }

    public Long getAgentId() {
        return agentId;
    }

    public void setAgentId(Long agentId) {
        this.agentId = agentId;
    }

    public String getAgentName() {
        return agentName;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName == null ? null : agentName.trim();
    }

    public Long getStoreId() {
        return storeId;
    }

    public void setStoreId(Long storeId) {
        this.storeId = storeId;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName == null ? null : storeName.trim();
    }
}