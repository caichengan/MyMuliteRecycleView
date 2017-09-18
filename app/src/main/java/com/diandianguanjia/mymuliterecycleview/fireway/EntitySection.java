package com.diandianguanjia.mymuliterecycleview.fireway;

import java.util.List;

/**
 * Created by an on 2017/9/15.
 */

public class EntitySection {


    private List<AllTagsListBean> allTagsList;

    public List<AllTagsListBean> getAllTagsList() {
        return allTagsList;
    }

    public void setAllTagsList(List<AllTagsListBean> allTagsList) {
        this.allTagsList = allTagsList;
    }

    public static class AllTagsListBean {
        /**
         * tagsName : 热门品牌
         * tagsId : 20
         * tagInfoList : [{"HotelLevels":[],"tagType":"5","tagName":"汉庭","tagId":"487","latlon":"","lat":"","lon":""},{"HotelLevels":[],"tagType":"5","tagName":"7天","tagId":"8","latlon":"","lat":"","lon":""},{"HotelLevels":[],"tagType":"5","tagName":"如家","tagId":"2","latlon":"","lat":"","lon":""},{"HotelLevels":[],"tagType":"5","tagName":"速8","tagId":"1","latlon":"","lat":"","lon":""},{"HotelLevels":[],"tagType":"5","tagName":"锦江之星","tagId":"7","latlon":"","lat":"","lon":""},{"HotelLevels":[],"tagType":"5","tagName":"飘HOME","tagId":"64","latlon":"","lat":"","lon":""},{"HotelLevels":[],"tagType":"5","tagName":"海友","tagId":"8780","latlon":"","lat":"","lon":""},{"HotelLevels":[],"tagType":"5","tagName":"锦江","tagId":"8792","latlon":"","lat":"","lon":""},{"HotelLevels":[],"tagType":"5","tagName":"世纪金源","tagId":"232","latlon":"","lat":"","lon":""}]
         */

        private String tagsName;
        private String tagsId;
        private List<TagInfoListBean> tagInfoList;

        public String getTagsName() {
            return tagsName;
        }

        public void setTagsName(String tagsName) {
            this.tagsName = tagsName;
        }

        public String getTagsId() {
            return tagsId;
        }

        public void setTagsId(String tagsId) {
            this.tagsId = tagsId;
        }

        public List<TagInfoListBean> getTagInfoList() {
            return tagInfoList;
        }

        public void setTagInfoList(List<TagInfoListBean> tagInfoList) {
            this.tagInfoList = tagInfoList;
        }

        public static class TagInfoListBean {
            /**
             * HotelLevels : []
             * tagType : 5
             * tagName : 汉庭
             * tagId : 487
             * latlon :
             * lat :
             * lon :
             */

            private String tagType;
            private String tagName;
            private String tagId;
            private String latlon;
            private String lat;
            private String lon;
            private List<?> HotelLevels;

            public String getTagType() {
                return tagType;
            }

            public void setTagType(String tagType) {
                this.tagType = tagType;
            }

            public String getTagName() {
                return tagName;
            }

            public void setTagName(String tagName) {
                this.tagName = tagName;
            }

            public String getTagId() {
                return tagId;
            }

            public void setTagId(String tagId) {
                this.tagId = tagId;
            }

            public String getLatlon() {
                return latlon;
            }

            public void setLatlon(String latlon) {
                this.latlon = latlon;
            }

            public String getLat() {
                return lat;
            }

            public void setLat(String lat) {
                this.lat = lat;
            }

            public String getLon() {
                return lon;
            }

            public void setLon(String lon) {
                this.lon = lon;
            }

            public List<?> getHotelLevels() {
                return HotelLevels;
            }

            public void setHotelLevels(List<?> HotelLevels) {
                this.HotelLevels = HotelLevels;
            }
        }
    }
}
