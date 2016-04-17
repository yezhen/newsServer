
package com.leixin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.leixin.dao.NewsCollectionDAO;
import com.leixin.model.NewsCollection;
import com.leixin.service.NewsCollectionService;

@Service
public class NewsCollectionServiceImpl implements NewsCollectionService {
    @Autowired
    @Qualifier("newsCollectionDAO")
    private NewsCollectionDAO newsCollectionDAO;


    public List<NewsCollection> findNewsCollectionByUserId(int userid) {
        // TODO Auto-generated method stub
        return newsCollectionDAO.findNewsCollectionByUserId(userid);
    }

    public int addNewsCollection(NewsCollection newScollection) {
        // TODO Auto-generated method stub
        return newsCollectionDAO.addNewsCollection(newScollection);
    }

    public NewsCollection findNewsCollectionByNewsId(int newsid) {
        // TODO Auto-generated method stub
        return newsCollectionDAO.findNewsCollectionByNewsId(newsid);
    }

}
