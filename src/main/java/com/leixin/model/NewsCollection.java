
package com.leixin.model;

/**
 * CREATE TABLE `newscollection` ( id INT(11) NOT NULL AUTO_INCREMENT, newsid
 * INT(11) DEFAULT NULL, userid INT(11) DEFAULT NULL, title VARCHAR(200) DEFAULT
 * NULL, createtime VARCHAR(50) DEFAULT NULL, imagepath VARCHAR(100) DEFAULT
 * NULL, PRIMARY KEY (`id`) ) ENGINE=INNODB DEFAULT CHARSET=utf8;
 * 
 * @author Administrator
 */
public class NewsCollection {
    private int id;

    private int newsid;

    private int userid;

    private String title;

    private String createtime;

    private String imagepath;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNewsid() {
        return newsid;
    }

    public void setNewsid(int newsid) {
        this.newsid = newsid;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }


    public String getImagepath() {
        return imagepath;
    }

    public void setImagepath(String imagepath) {
        this.imagepath = imagepath;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }



}
