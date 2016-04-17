
package com.leixin.model;

/**
 * id INT(11) NOT NULL AUTO_INCREMENT, newsid INT(11) DEFAULT NULL, userid
 * INT(11)DEFAULT NULL, content VARCHAR(500), createtime VARCHAR(100) DEFAULT
 * NULL, COUNT INT(11)DEFAULT NULL
 * 
 * @author Administrator
 */
public class NewsComment {
    private int id;

    private int newsid;

    private int userid;

    private String content;

    private String createtime;

    private int count;

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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

}
