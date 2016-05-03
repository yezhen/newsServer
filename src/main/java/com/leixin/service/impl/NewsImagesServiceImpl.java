
package com.leixin.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.leixin.dao.NewsImagesDAO;
import com.leixin.model.NewsImages;
import com.leixin.service.NewsImagesService;

@Service
public class NewsImagesServiceImpl implements NewsImagesService {
    @Autowired
    @Qualifier("newsImagesDAO")
    private NewsImagesDAO newsImagesDAO;


    @Override
    public NewsImages findNewsImageByNewsId(int newsId) {
        // TODO Auto-generated method stub
        return newsImagesDAO.findNewsImageByNewsId(newsId);
    }

    @Override
    public int insertNewsImages(NewsImages newsImages) {
        // TODO Auto-generated method stub
        return newsImagesDAO.insertNewsImages(newsImages);
    }

}
