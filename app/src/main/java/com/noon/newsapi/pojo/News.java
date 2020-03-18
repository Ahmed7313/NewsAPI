package com.noon.newsapi.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class News {

    @SerializedName("status")
    @Expose
    private String status;

    @SerializedName("totalResults")
    @Expose
    private String totalResults;

    @SerializedName("articles")
    @Expose
    private List<Article> article;

    public String getStatus() {
        return status;
    }

    public String getTotalResults() {
        return totalResults;
    }

    public List<Article> getArticle() {
        return article;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setTotalResults(String totalResults) {
        this.totalResults = totalResults;
    }

    public void setArticle(List<Article> article) {
        this.article = article;
    }
}
