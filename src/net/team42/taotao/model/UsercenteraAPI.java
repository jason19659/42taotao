package net.team42.taotao.model;

import java.util.Date;

import net.team42.taotao.utils.JsonDateSerializer;

import org.codehaus.jackson.map.annotate.JsonSerialize;

public class UsercenteraAPI {
    private Integer taotaoUserId;

    private Integer usercenterUserId;

    private Date joinDate;

    public Integer getTaotaoUserId() {
        return taotaoUserId;
    }

    public void setTaotaoUserId(Integer taotaoUserId) {
        this.taotaoUserId = taotaoUserId;
    }

    public Integer getUsercenterUserId() {
        return usercenterUserId;
    }

    public void setUsercenterUserId(Integer usercenterUserId) {
        this.usercenterUserId = usercenterUserId;
    }
    @JsonSerialize(using=JsonDateSerializer.class)
    public Date getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }
}