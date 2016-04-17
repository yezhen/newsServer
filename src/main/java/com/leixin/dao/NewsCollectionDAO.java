
package com.leixin.dao;

import java.util.List;

import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.leixin.model.NewsCollection;

@Transactional(propagation = Propagation.REQUIRES_NEW, readOnly = false, isolation = Isolation.DEFAULT)
public interface NewsCollectionDAO {
    List<NewsCollection> findNewsCollectionByUserId(int userid);

    int addNewsCollection(NewsCollection newScollection);
    
    NewsCollection findNewsCollectionByNewsId(int newsid);

}
