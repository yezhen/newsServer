
package com.leixin.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.leixin.model.NewsComment;
import com.leixin.service.NewsCommentService;

/**
 * @author Administrator
 */
@Controller
public class NewsCommentController {

    @Autowired
    private NewsCommentService newsCommentService;

    @RequestMapping(value = "findNewsContentByNewsId", method = RequestMethod.GET)
    public @ResponseBody Map<String, Object> findNewsContentByNewsId(int newsid) {
        Map<String, Object> map = new HashMap<String, Object>();
        List<NewsComment> newsComments = newsCommentService.findNewsContentByNewsId(newsid);
        System.out.println("newsComments=" + newsComments);
        int msg = 0;
        if (newsComments == null) {
            msg = 0;
        } else {
            msg = 1;
            map.put("newsComments", newsComments);
        }
        map.put("msg", msg);
        return map;
    }

    @RequestMapping(value = "addContent", method = RequestMethod.GET)
    public @ResponseBody Map<String, Object> addContent(NewsComment newsComment) {
        int addContent = newsCommentService.addContent(newsComment);
        Map<String, Object> map = new HashMap<String, Object>();
        System.out.println("addContent=" + addContent);
        map.put("msg", addContent);
        return map;
    }

}
