
package com.leixin.service;

import java.util.List;

import com.leixin.model.NewsComment;

public interface NewsCommentService {

    List<NewsComment> findNewsContentByNewsId(int newsId);

    int addContent(NewsComment newsContent);

}
