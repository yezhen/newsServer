
package com.leixin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.leixin.dao.NewsDAO;
import com.leixin.model.News;
import com.leixin.service.NewsService;

@Service
public class NewsServiceImpl implements NewsService {
    @Autowired
    @Qualifier("newsDAO")
    private NewsDAO newsDAO;

    public List<News> findNewsByNewscategoryid(int newscategoryid) {
        return newsDAO.findNewsByNewscategoryid(newscategoryid);
    }

    public News findNewsById(int id) {
        return newsDAO.findNewsById(id);
    }

    public List<News> findNewsByNewsByPosition(int position) {
        // TODO Auto-generated method stub
        return newsDAO.findNewsByNewsByPosition(position);
    }

}
