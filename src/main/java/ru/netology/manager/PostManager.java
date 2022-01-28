package ru.netology.manager;

import ru.netology.domain.Header;
import ru.netology.domain.Body;
import ru.netology.domain.Footer;
import ru.netology.domain.PostInfo;

public class PostManager {
    private HeaderManager headerManager;
    private BodyManager bodyManager;
    private FooterManager footerManager;
    private PostInfoManager postInfoManager;

    ///метод забирает список header из  HeaderManager и отображает их, применимо к другим менеджерам.
    public String generatePage() {
        Header[] header = headerManager.getHeaderForFeed();
        Body[] body = bodyManager.getBodyForFeed();
        Footer[] footer = footerManager.getFooterForFeed();
        PostInfo[] postInfo = postInfoManager.getPostInfoForFeed();
        return null;
    }

}
