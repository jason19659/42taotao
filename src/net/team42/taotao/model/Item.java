package net.team42.taotao.model;

import java.util.Date;

import net.team42.taotao.utils.JsonDateSerializer;

import org.codehaus.jackson.map.annotate.JsonSerialize;

public class Item {
    private Integer id;

    private String title;

    private String name;

    private Integer originalPrize;

    private Integer currentPrize;

    private String recency;

    private String type;

    private String images;

    private String describe;

    private Date pubdate;

    private Boolean isOnsale;

    private Boolean isVaild;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getOriginalPrize() {
        return originalPrize;
    }

    public void setOriginalPrize(Integer originalPrize) {
        this.originalPrize = originalPrize;
    }

    public Integer getCurrentPrize() {
        return currentPrize;
    }

    public void setCurrentPrize(Integer currentPrize) {
        this.currentPrize = currentPrize;
    }

    public String getRecency() {
        return recency;
    }

    public void setRecency(String recency) {
        this.recency = recency == null ? null : recency.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images == null ? null : images.trim();
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe == null ? null : describe.trim();
    }
    @JsonSerialize(using=JsonDateSerializer.class)
    public Date getPubdate() {
        return pubdate;
    }

    public void setPubdate(Date pubdate) {
        this.pubdate = pubdate;
    }

    public Boolean getIsOnsale() {
        return isOnsale;
    }

    public void setIsOnsale(Boolean isOnsale) {
        this.isOnsale = isOnsale;
    }

    public Boolean getIsVaild() {
        return isVaild;
    }

    public void setIsVaild(Boolean isVaild) {
        this.isVaild = isVaild;
    }
}