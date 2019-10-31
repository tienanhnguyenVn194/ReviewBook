package com.example.gat_review_api.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Edition {
    @SerializedName("author")
    @Expose
    private String author;
    @SerializedName("bookId")
    @Expose
    private Integer bookId;
    @SerializedName("editionId")
    @Expose
    private Integer editionId;
    @SerializedName("imageId")
    @Expose
    private String imageId;
    @SerializedName("title")
    @Expose
    private String title;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public Integer getEditionId() {
        return editionId;
    }

    public void setEditionId(Integer editionId) {
        this.editionId = editionId;
    }

    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
