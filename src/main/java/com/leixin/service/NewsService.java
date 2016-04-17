
package com.leixin.service;

import java.util.List;

import com.leixin.model.News;

public interface NewsService {
    List<News> findNewsByNewscategoryid(int newscategoryid);

    News findNewsById(int id);

}
