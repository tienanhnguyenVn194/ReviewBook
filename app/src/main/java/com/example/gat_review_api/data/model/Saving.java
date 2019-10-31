package com.example.gat_review_api.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Saving {
    @SerializedName("reviewId")
    @Expose
    private Integer reviewId;
    @SerializedName("saving")
    @Expose
    private Boolean saving;
    @SerializedName("userId")
    @Expose
    private Integer userId;

    public Integer getReviewId() {
        return reviewId;
    }

    public void setReviewId(Integer reviewId) {
        this.reviewId = reviewId;
    }

    public Boolean getSaving() {
        return saving;
    }

    public void setSaving(Boolean saving) {
        this.saving = saving;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
