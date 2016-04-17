
package com.leixin.dao;

import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.leixin.model.NewsImage;

@Transactional(propagation = Propagation.REQUIRES_NEW, readOnly = false, isolation = Isolation.DEFAULT)
public interface NewsImageDAO {

    NewsImage findNewsImageByNewsId(int newsId);

}
