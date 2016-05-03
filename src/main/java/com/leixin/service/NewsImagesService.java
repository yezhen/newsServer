
package com.leixin.service;

import com.leixin.model.NewsImages;

public interface NewsImagesService {

    NewsImages findNewsImageByNewsId(int newsId);

    int insertNewsImages(NewsImages newsImages);// 插入图片和新闻

}
