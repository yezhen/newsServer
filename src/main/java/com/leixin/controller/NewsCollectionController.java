
package com.leixin.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.leixin.model.NewsCollection;
import com.leixin.service.NewsCollectionService;

/**
 * @author Administrator
 */
@Controller
public class NewsCollectionController {

    @Autowired
    private NewsCollectionService newsCollectionService;

    @RequestMapping(value = "findNewsCollectionByUserId", method = RequestMethod.GET)
    public @ResponseBody Map<String, Object> findNewsCollectionByUserId(int userid) {
        Map<String, Object> map = new HashMap<String, Object>();
        List<NewsCollection> NewsCollections = newsCollectionService.findNewsCollectionByUserId(userid);
        System.out.println("NewsCollections=" + NewsCollections);
        int msg = 0;
        if (NewsCollections == null || NewsCollections.size() == 0) {
            msg = 0;
        } else {
            msg = 1;
            map.put("NewsCollections", NewsCollections);
        }
        map.put("msg", msg);
        return map;
    }

    @RequestMapping(value = "findNewsCollectionByNewsId", method = RequestMethod.GET)
    public @ResponseBody Map<String, Object> findNewsCollectionByNewsId(int newsid) {
        Map<String, Object> map = new HashMap<String, Object>();
        NewsCollection newsCollection = newsCollectionService.findNewsCollectionByNewsId(newsid);
        System.out.println("newsCollection=" + newsCollection);
        int msg = 0;
        if (newsCollection == null) {
            msg = 0;
        } else {
            msg = 1;
            map.put("newsCollection", newsCollection);
        }
        map.put("msg", msg);
        return map;
    }

    @RequestMapping(value = "addNewsCollection", method = RequestMethod.POST)
    public @ResponseBody Map<String, Object> addNewsCollection(NewsCollection newsCollection) {
        Map<String, Object> map = new HashMap<String, Object>();
        NewsCollection temp = newsCollectionService.findNewsCollectionByNewsId(newsCollection.getNewsid());
        int msg;
        if (temp == null) {
            msg = 0;// 已经收藏
        } else {
            int addNewsCollection = newsCollectionService.addNewsCollection(newsCollection);
            if (addNewsCollection == 1) {
                msg = 1;// 收藏成功
            } else {
                msg = 2;// 收藏失败
            }
        }
        map.put("msg", msg);
        return map;
    }

}
