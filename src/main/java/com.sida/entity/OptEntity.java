package com.sida.entity;

import javax.persistence.Column;
import java.util.Date;

public class OptEntity {

    @Column
    private Date addTime;

    @Column
    private Date updateTime;

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
