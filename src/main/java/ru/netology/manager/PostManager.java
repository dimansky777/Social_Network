package ru.netology.manager;

import ru.netology.domain.*;

public class PostManager {
    private RepostManager repostManager;
    private UserManager userManager;
    private LikesManager likeManager;
    private PostInfoManager postInfoManager;
    private CommentsManager commentsManager;
    private ViewsManager viewsManager;

    ///метод забирает список header из  HeaderManager и отображает их, применимо к другим менеджерам.
    public String generatePage() {
        RepostInfo[] repostInfo = repostManager.getRepostForFeed();
        UserInfo[] userInfo = userManager.getUserForFeed();
        LikesInfo[] likesInfo = likeManager.getLikesForFeed();
        PostInfo[] postInfo = postInfoManager.getPostInfoForFeed();
        CommentsInfo[] commentsInfo = commentsManager.getCommentsInfoForFeed();
        ViewsInfo[] viewInfo = viewsManager.getViewsInfoForFeed();
        return null;
    }

}
