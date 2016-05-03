
package com.leixin.dao;

import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.leixin.model.NewsImages;

@Transactional(propagation = Propagation.REQUIRES_NEW, readOnly = false, isolation = Isolation.DEFAULT)
public interface NewsImagesDAO {

    NewsImages findNewsImageByNewsId(int newsId);

    int insertNewsImages(NewsImages newsImages);// 插入图片和新闻

}
