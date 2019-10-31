package com.example.gat_review_api.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Evaluation {
    @SerializedName("draftFlag")
    @Expose
    private Boolean draftFlag;
    @SerializedName("editionId")
    @Expose
    private Integer editionId;
    @SerializedName("evaluationTime")
    @Expose
    private String evaluationTime;
    @SerializedName("intro")
    @Expose
    private String intro;
    @SerializedName("review")
    @Expose
    private String review;
    @SerializedName("reviewId")
    @Expose
    private Integer reviewId;
    @SerializedName("reviewType")
    @Expose
    private Integer reviewType;
    @SerializedName("spoiler")
    @Expose
    private Boolean spoiler;
    @SerializedName("userId")
    @Expose
    private Integer userId;
    @SerializedName("value")
    @Expose
    private Integer value;

    public Boolean getDraftFlag() {
        return draftFlag;
    }

    public void setDraftFlag(Boolean draftFlag) {
        this.draftFlag = draftFlag;
    }

    public Integer getEditionId() {
        return editionId;
    }

    public void setEditionId(Integer editionId) {
        this.editionId = editionId;
    }

    public String getEvaluationTime() {
        return evaluationTime;
    }

    public void setEvaluationTime(String evaluationTime) {
        this.evaluationTime = evaluationTime;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public Integer getReviewId() {
        return reviewId;
    }

    public void setReviewId(Integer reviewId) {
        this.reviewId = reviewId;
    }

    public Integer getReviewType() {
        return reviewType;
    }

    public void setReviewType(Integer reviewType) {
        this.reviewType = reviewType;
    }

    public Boolean getSpoiler() {
        return spoiler;
    }

    public void setSpoiler(Boolean spoiler) {
        this.spoiler = spoiler;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

}
