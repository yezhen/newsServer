
package com.leixin.model;

/**
 * @author Administrator
 */
public class News {
    private int id;

    private String title;

    private String content;

    private String category;

    private String source;

    private String newstime;

    private int pub_time;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public int getPub_time() {
        return pub_time;
    }

    public void setPub_time(int pub_time) {
        this.pub_time = pub_time;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getNewstime() {
        return newstime;
    }

    public void setNewstime(String newstime) {
        this.newstime = newstime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
