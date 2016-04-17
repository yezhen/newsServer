
package com.leixin.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.leixin.dao.NewsImageDAO;
import com.leixin.model.NewsImage;
import com.leixin.service.NewsImageService;

@Service
public class NewsImageServiceImpl implements NewsImageService {
    @Autowired
    @Qualifier("newsImageDAO")
    private NewsImageDAO newsImageDAO;

    public NewsImage findNewsImageByNewsId(int newsId) {
        // TODO Auto-generated method stub
        return newsImageDAO.findNewsImageByNewsId(newsId);
    }

}
