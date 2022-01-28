package ru.netology.domain;

public class Footer {
    private String likeImage;
    //getter/setter
    private int likeCount;
    //getter/setter

    public class CommentsInfo {
        private int countLikes;
        private boolean canPost;
        private int groups_can_post;
        private boolean can_open;

        //getter/setter
    }


    public class SharePost {
        private int count;
        private int user_repostedId;
        //getter/setter
    }

    private int viewsCount;
    //getter+setter;


    public class LikesInfo {
        private int likeCount;
        private int whoLikesId;
        private int canLike;
        //getter+setter;
    }
}
