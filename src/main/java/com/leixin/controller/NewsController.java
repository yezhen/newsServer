
package com.leixin.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.leixin.model.News;
import com.leixin.service.NewsService;

/**
 * @author Administrator
 */
@Controller
public class NewsController {

    @Autowired
    private NewsService newsService;

    @RequestMapping(value = "findNewsByNewscategoryid", method = RequestMethod.GET)
    public @ResponseBody Map<String, Object> findNewsByNewscategoryid(int newscategoryid) {
        Map<String, Object> map = new HashMap<String, Object>();
        List<News> listNews = newsService.findNewsByNewscategoryid(newscategoryid);
        System.out.println("listNews=" + listNews);
        int msg = 0;
        if (listNews == null) {
            msg = 0;
        } else {
            msg = 1;
            map.put("listNews", listNews);
        }
        map.put("msg", msg);
        return map;
    }

    @RequestMapping(value = "findNewsById", method = RequestMethod.GET)
    public @ResponseBody Map<String, Object> findNewsById(int id) {
        News news = newsService.findNewsById(id);
        Map<String, Object> map = new HashMap<String, Object>();
        System.out.println("news=" + news);
        int msg = 0;
        if (null == news) {
            msg = 0;
        } else {
            msg = 1;
            map.put("news", news);
        }
        map.put("msg", msg);
        return map;
    }

}
