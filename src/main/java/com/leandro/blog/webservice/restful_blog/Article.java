package com.leandro.blog.webservice.restful_blog;

public class Article {

    private int articleId;   // DECLARE serial ID instance variable
    private String createdBy;
    private String emailAddress;
    private String publishedDate;
    private String publishedTimeStamp;
    private String modifiedDate;
    private String modifiedTimeStamp;
    private String tags;
    private String blogTitle;
    private String blogText;

    // Constructors
    public Article(){
    };

    public Article(String createdBy, String emailAddress, String publishedDate, String publishedTimeStamp,
                   String modifiedDate, String modifiedTimeStamp, String tags, String blogTitle, String blogText){
        this.createdBy = createdBy;
        this.emailAddress = emailAddress;
        this.publishedDate = publishedDate;
        this.publishedTimeStamp = publishedTimeStamp;
        this.modifiedDate = modifiedDate;
        this.modifiedTimeStamp = modifiedTimeStamp;
        this.tags = tags;
        this.blogTitle = blogTitle;
        this.blogText = blogText;
    };

    // Methods

    public int getArticleId(){
        return articleId;
    };

    public void setArticleId(int articleId) {
        this.articleId = articleId;
    }

    public String getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(String publishedDate) {
        this.publishedDate = publishedDate;
    }

    public String getPublishedTimeStamp() {
        return publishedTimeStamp;
    }

    public void setPublishedTimeStamp(String publishedTimeStamp) {
        this.publishedTimeStamp = publishedTimeStamp;
    }

    public String getModifiedTimeStamp() {
        return modifiedTimeStamp;
    }

    public void setModifiedTimeStamp(String modifiedTimeStamp) {
        this.modifiedTimeStamp = modifiedTimeStamp;
    }

    public String getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(String modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getBlogTitle() {
        return blogTitle;
    }

    public void setBlogTitle(String blogTitle) {
        this.blogTitle = blogTitle;
    }

    public String getBlogText() {
        return blogText;
    }

    public void setBlogText(String blogText) {
        this.blogText = blogText;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    @Override
    public String toString() {
        return "Article{" +
                "articleId=" + articleId +
                ", createdBy='" + createdBy + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", publishedDate='" + publishedDate + '\'' +
                ", publishedTimeStamp='" + publishedTimeStamp + '\'' +
                ", modifiedDate='" + modifiedDate + '\'' +
                ", modifiedTimeStamp='" + modifiedTimeStamp + '\'' +
                ", tags='" + tags + '\'' +
                ", blogTitle='" + blogTitle + '\'' +
                ", blogText='" + blogText + '\'' +
                '}';
    }
}
