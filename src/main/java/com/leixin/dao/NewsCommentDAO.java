
package com.leixin.dao;

import java.util.List;

import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.leixin.model.NewsComment;

@Transactional(propagation = Propagation.REQUIRES_NEW, readOnly = false, isolation = Isolation.DEFAULT)
public interface NewsCommentDAO{
    List<NewsComment> findNewsContentByNewsId(int newsId);

    int addContent(NewsComment newsContent);

}
