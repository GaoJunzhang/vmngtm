package com.zero.vmngtm.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "termina_media")
public class TerminaMedia {
    @Id
    private Integer id;

    private Integer tid;

    private Integer mid;

    @Column(name = "play_time")
    private Date playTime;

    private Integer cid;

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
     * @return tid
     */
    public Integer getTid() {
        return tid;
    }

    /**
     * @param tid
     */
    public void setTid(Integer tid) {
        this.tid = tid;
    }

    /**
     * @return mid
     */
    public Integer getMid() {
        return mid;
    }

    /**
     * @param mid
     */
    public void setMid(Integer mid) {
        this.mid = mid;
    }

    /**
     * @return play_time
     */
    public Date getPlayTime() {
        return playTime;
    }

    /**
     * @param playTime
     */
    public void setPlayTime(Date playTime) {
        this.playTime = playTime;
    }

    /**
     * @return cid
     */
    public Integer getCid() {
        return cid;
    }

    /**
     * @param cid
     */
    public void setCid(Integer cid) {
        this.cid = cid;
    }
}