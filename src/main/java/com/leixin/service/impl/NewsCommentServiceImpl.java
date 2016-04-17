
package com.leixin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.leixin.dao.NewsCommentDAO;
import com.leixin.model.NewsComment;
import com.leixin.service.NewsCommentService;

@Service
public class NewsCommentServiceImpl implements NewsCommentService {
    @Autowired
    @Qualifier("newsCommentDAO")
    private NewsCommentDAO newsCommentDAO;

    public List<NewsComment> findNewsContentByNewsId(int newsId) {
        // TODO Auto-generated method stub
        return newsCommentDAO.findNewsContentByNewsId(newsId);
    }

    public int addContent(NewsComment newsContent) {
        // TODO Auto-generated method stub
        return newsCommentDAO.addContent(newsContent);
    }

}
