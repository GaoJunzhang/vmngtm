package com.zero.vmngtm.model;

import java.util.Date;
import javax.persistence.*;

public class Media {
    @Id
    private Integer id;

    private Date createtime;

    private String name;

    private Integer sumplaycount;

    private Integer uid;

    private Short enable;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return createtime
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * @param createtime
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return sumplaycount
     */
    public Integer getSumplaycount() {
        return sumplaycount;
    }

    /**
     * @param sumplaycount
     */
    public void setSumplaycount(Integer sumplaycount) {
        this.sumplaycount = sumplaycount;
    }

    /**
     * @return uid
     */
    public Integer getUid() {
        return uid;
    }

    /**
     * @param uid
     */
    public void setUid(Integer uid) {
        this.uid = uid;
    }

    /**
     * @return enable
     */
    public Short getEnable() {
        return enable;
    }

    /**
     * @param enable
     */
    public void setEnable(Short enable) {
        this.enable = enable;
    }
}