package ru.netology.domain;

public class CommentsInfo {
    private int count;
    private int id;
    private int userId;
    private int dateOfComment;
    private String text;
    private boolean canComment;
    private boolean canLike;
    private int countOfLikes;
    private boolean topComment;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getDateOfComment() {
        return dateOfComment;
    }

    public void setDateOfComment(int dateOfComment) {
        this.dateOfComment = dateOfComment;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isCanComment() {
        return canComment;
    }

    public void setCanComment(boolean canComment) {
        this.canComment = canComment;
    }

    public boolean isCanLike() {
        return canLike;
    }

    public void setCanLike(boolean canLike) {
        this.canLike = canLike;
    }

    public int getCountOfLikes() {
        return countOfLikes;
    }

    public void setCountOfLikes(int countOfLikes) {
        this.countOfLikes = countOfLikes;
    }

    public boolean isTopComment() {
        return topComment;
    }

    public void setTopComment(boolean topComment) {
        this.topComment = topComment;
    }

}
