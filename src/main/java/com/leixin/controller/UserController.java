
package com.leixin.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.leixin.model.User;
import com.leixin.service.UserService;

/**
 * @author Administrator 数字0 注册失败 数字1 代表成功 数字2 用户存在
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "index")
    public ModelAndView index(User user) {
        userService.insertUser(user);
        ModelAndView mav = new ModelAndView();
        mav.setViewName("index");
        mav.addObject("user", user);
        return mav;
    }

    /**
     * 用户登录
     * http://localhost:8080/news/findUserByNameAndPassword%EF%BC%9Fname=life
     * &password=123
     * 
     * @param user
     * @return
     */
    @RequestMapping(value = "findUserByNameAndPassword", method = RequestMethod.GET)
    public @ResponseBody Map<String, Object> findUserByNameAndPassword(User user) {
        Map<String, Object> map = new HashMap<String, Object>();
        User tempUser = userService.findUserByNameAndPassword(user);
        System.out.println("user=" + user);
        int msg = 0;
        if (tempUser == null) {
            msg = 0;
        } else {
            msg = 1;
        }
        map.put("user", tempUser);
        map.put("msg", msg);
        return map;
    }

    @RequestMapping(value = "findUserByPhone", method = RequestMethod.GET)
    public @ResponseBody Map<String, Object> findUserByPhone(User user) {
        Map<String, Object> map = new HashMap<String, Object>();
        User tempUser = userService.findUserByPhone(user);
        System.out.println("user=" + user);
        int msg = 0;
        if (tempUser == null) {
            msg = 0;
        } else {
            msg = 1;
        }
        map.put("user", tempUser);
        map.put("msg", msg);
        return map;
    }

    /**
     * 用户注册
     * 
     * @param name
     * @return
     */
    @RequestMapping(value = "addUser", method = RequestMethod.GET)
    public @ResponseBody Map<String, Object> addUser(User user) {
        User tempUser = userService.findUser(user.getName());
        Map<String, Object> map = new HashMap<String, Object>();
        System.out.println("user=" + user);
        int msg = 0;
        if (null == tempUser) {
            int i = userService.insertUser(user);
            System.out.println("i=" + i);
            if (i == 1) {
                msg = 1;
                map.put("user", user);
            } else {
                msg = 0;
            }
        } else {
            msg = 2;
        }
        map.put("msg", msg);
        return map;
    }

    @RequestMapping(value = "updateUserByPassword", method = RequestMethod.GET)
    public @ResponseBody Map<String, Object> updateUserByPassword(User user) {
        Map<String, Object> map = new HashMap<String, Object>();
        int msg = 0;
        int i = userService.updateUserByPassword(user);
        System.out.println("i=" + i);
        if (i == 1) {
            msg = 1;
            map.put("user", user);
        } else {
            msg = 0;
        }
        map.put("msg", msg);
        return map;
    }

}
