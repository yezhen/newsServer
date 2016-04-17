
package com.leixin.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.leixin.model.NewsImage;
import com.leixin.service.NewsImageService;

/**
 * @author Administrator
 */
@Controller
public class NewsImageController {

    @Autowired
    private NewsImageService newsImageService;

    @RequestMapping(value = "findNewsImageByNewsId", method = RequestMethod.GET)
    public @ResponseBody Map<String, Object> findNewsImageByNewsId(int newsid) {
        Map<String, Object> map = new HashMap<String, Object>();
        NewsImage newsImage = newsImageService.findNewsImageByNewsId(newsid);
        System.out.println("newsImage=" + newsImage);
        int msg = 0;
        if (newsImage == null) {
            msg = 0;
        } else {
            msg = 1;
            map.put("listNews", newsImage);
        }
        map.put("msg", msg);
        return map;
    }
}
