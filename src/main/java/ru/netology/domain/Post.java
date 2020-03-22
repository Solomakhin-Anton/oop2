package ru.netology.domain;

public class Post {
    private int postId;
    private int wallOwnerId;
    private int authorId;
    private int postTime;
    private String text;
    private int replayOwnerId;
    private int replayPostId;
    private int signerId;
    private boolean canPin;
    private boolean canDelete;
    private boolean canEdit;
    private boolean isPinned;
    private boolean markedAsAds;
    private boolean isFavorite;

    private CommentsInfo commentsInfo;
    private GeoInfo geoInfo;
    private LikesInfo likesInfo;
    private RepostsInfo repostsInfo;
    private ViewsInfo viewsInfo;

    private String imageUrl;





}
