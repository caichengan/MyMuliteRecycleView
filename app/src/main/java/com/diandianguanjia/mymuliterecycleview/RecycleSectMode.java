package com.diandianguanjia.mymuliterecycleview;

import com.chad.library.adapter.base.entity.MultiItemEntity;
import com.chad.library.adapter.base.entity.SectionEntity;

/**
 * Created by an on 2017/9/15.
 */

public class RecycleSectMode extends SectionEntity {

    public static final int TEXT = 1;
    public static final int IMG = 2;
    private String id;
    private String name;
    private String title;
    private String imgURL;
    private String content;

    private int style;
    private String price;

    public RecycleSectMode(boolean isHeader, String header) {
        super(isHeader, header);
    }

    public RecycleSectMode(Object o) {
        super(o);
    }

    public int getStyle() {
        return style;
    }

    public void setStyle(int style) {
        this.style = style;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImgURL() {
        return imgURL;
    }

    public void setImgURL(String imgURL) {
        this.imgURL = imgURL;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }


}
