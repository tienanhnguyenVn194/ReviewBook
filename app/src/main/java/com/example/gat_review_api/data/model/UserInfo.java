package com.example.gat_review_api.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UserInfo {

        @SerializedName("about")
        @Expose
        private String about;
        @SerializedName("address")
        @Expose
        private String address;
        @SerializedName("bookSharingMode")
        @Expose
        private Integer bookSharingMode;
        @SerializedName("coverImageId")
        @Expose
        private String coverImageId;
        @SerializedName("imageId")
        @Expose
        private String imageId;
        @SerializedName("memberType")
        @Expose
        private Integer memberType;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("reviewCount")
        @Expose
        private Integer reviewCount;
        @SerializedName("sharingCount")
        @Expose
        private Integer sharingCount;
        @SerializedName("userId")
        @Expose
        private Integer userId;
        @SerializedName("userTypeFlag")
        @Expose
        private Integer userTypeFlag;

        public String getAbout() {
            return about;
        }

        public void setAbout(String about) {
            this.about = about;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public Integer getBookSharingMode() {
            return bookSharingMode;
        }

        public void setBookSharingMode(Integer bookSharingMode) {
            this.bookSharingMode = bookSharingMode;
        }

        public String getCoverImageId() {
            return coverImageId;
        }

        public void setCoverImageId(String coverImageId) {
            this.coverImageId = coverImageId;
        }

        public String getImageId() {
            return imageId;
        }

        public void setImageId(String imageId) {
            this.imageId = imageId;
        }

        public Integer getMemberType() {
            return memberType;
        }

        public void setMemberType(Integer memberType) {
            this.memberType = memberType;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getReviewCount() {
            return reviewCount;
        }

        public void setReviewCount(Integer reviewCount) {
            this.reviewCount = reviewCount;
        }

        public Integer getSharingCount() {
            return sharingCount;
        }

        public void setSharingCount(Integer sharingCount) {
            this.sharingCount = sharingCount;
        }

        public Integer getUserId() {
            return userId;
        }

        public void setUserId(Integer userId) {
            this.userId = userId;
        }

        public Integer getUserTypeFlag() {
            return userTypeFlag;
        }

        public void setUserTypeFlag(Integer userTypeFlag) {
            this.userTypeFlag = userTypeFlag;
        }

    }
