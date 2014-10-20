package net.team42.taotao.model;

import java.util.Date;

import net.team42.taotao.utils.JsonDateSerializer;

import org.codehaus.jackson.map.annotate.JsonSerialize;

public class Popular {
    private Integer id;

    private Integer itemId;

    private Date pubdate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }
    @JsonSerialize(using=JsonDateSerializer.class)
    public Date getPubdate() {
        return pubdate;
    }

    public void setPubdate(Date pubdate) {
        this.pubdate = pubdate;
    }
}