package ru.netology.domain;

public class PostInfo {
    private int id;
    private int ownerId;
    private int fromId;
    private int createdBy;
    private int signedId;
    private String text;
    private int date;
    private int replyOwnerId;
    private int replyPostId;
    private int friendsOnly;
    private int markAsAds;
    private boolean canPinned;
    private boolean canEdit;
    private boolean canDelete;
    private boolean canLike;
    private boolean canPublish;
    private boolean canClose;
    private boolean canOpen;
    private int userLike;
    private boolean isFavorite;
    private String geoType;
    private String geoCoordinates;
    private String geoPlace;
    private int userRepost;
    private String sourcePostType;
    private String sourcePostPlatform;
    private String sourcePostDate;
    private String sourcePostUrl;

    //getter+setter;
}
