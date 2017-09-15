package com.diandianguanjia.mymuliterecycleview;

/**
 * Created by an on 2017/9/15.
 */

public class Model {


    /**
     * title : 洗发水不能直接抹在头上？关于洗头的 4 个说法，是真是假？
     * url : http://dxy.com/column/10424
     * content : 洗头可以说是天天都要做的事，如果天气热还不洗的话，头上的油多到能炒菜。
     * cover : http://dxy.com/attachment/show/1205912
     * show_type : 1
     * from : appIndexAdmin
     * author : {"id":888,"name":"陈奇权","url":"chenqiquan","avatar":"http://img.dxycdn.com/dotcom/2017/01/19/54/djqle1bq.jpg","remarks":"第三军医大学第一附属医院 皮肤科博士"}
     * tags_str : 健康问答
     */

    private String title;
    private String url;
    private String content;
    private String cover;
    private int show_type;
    private String from;
    private AuthorBean author;
    private String tags_str;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public int getShow_type() {
        return show_type;
    }

    public void setShow_type(int show_type) {
        this.show_type = show_type;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public AuthorBean getAuthor() {
        return author;
    }

    public void setAuthor(AuthorBean author) {
        this.author = author;
    }

    public String getTags_str() {
        return tags_str;
    }

    public void setTags_str(String tags_str) {
        this.tags_str = tags_str;
    }

    public static class AuthorBean {
        /**
         * id : 888
         * name : 陈奇权
         * url : chenqiquan
         * avatar : http://img.dxycdn.com/dotcom/2017/01/19/54/djqle1bq.jpg
         * remarks : 第三军医大学第一附属医院 皮肤科博士
         */

        private int id;
        private String name;
        private String url;
        private String avatar;
        private String remarks;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getAvatar() {
            return avatar;
        }

        public void setAvatar(String avatar) {
            this.avatar = avatar;
        }

        public String getRemarks() {
            return remarks;
        }

        public void setRemarks(String remarks) {
            this.remarks = remarks;
        }
    }
}
