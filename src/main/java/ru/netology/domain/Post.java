package ru.netology.domain;

public class Post {
    private int postId;
    private int ownerId;
    private int writerId;
    private int dateOfPost;
    private String text;
    private AttachmentsInfo attachmentsInfo;
    private CommentsInfo commentsInfo;
    private int countOfLikes;
    private int countOfReposts;

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public int getWriterId() {
        return writerId;
    }

    public void setWriterId(int writerId) {
        this.writerId = writerId;
    }

    public int getDateOfPost() {
        return dateOfPost;
    }

    public void setDateOfPost(int dateOfPost) {
        this.dateOfPost = dateOfPost;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public AttachmentsInfo getAttachmentsInfo() {
        return attachmentsInfo;
    }

    public void setAttachmentsInfo(AttachmentsInfo attachmentsInfo) {
        this.attachmentsInfo = attachmentsInfo;
    }

    public CommentsInfo getCommentsInfo() {
        return commentsInfo;
    }

    public void setCommentsInfo(CommentsInfo commentsInfo) {
        this.commentsInfo = commentsInfo;
    }

    public int getCountOfLikes() {
        return countOfLikes;
    }

    public void setCountOfLikes(int countOfLikes) {
        this.countOfLikes = countOfLikes;
    }

    public int getCountOfReposts() {
        return countOfReposts;
    }

    public void setCountOfReposts(int countOfReposts) {
        this.countOfReposts = countOfReposts;
    }
}
