
package com.leixin.service;

import java.util.List;

import com.leixin.model.NewsCollection;

public interface NewsCollectionService {

    List<NewsCollection> findNewsCollectionByUserId(int userid);

    int addNewsCollection(NewsCollection newScollection);
    
    NewsCollection findNewsCollectionByNewsId(int newsid);

}
