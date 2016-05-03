/**
 * news_image表
 */

package com.leixin.model;

public class NewsImages {
    private int id;

    private String title;

    private String content;

    private int sourceid;

    private int pub_time;

    private String imagepath;

    private String imagename;

    private String iamgeservername;

    private int newscategoryid;

    private String create_time;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public int getSourceid() {
        return sourceid;
    }

    public void setSourceid(int sourceid) {
        this.sourceid = sourceid;
    }

    public int getPub_time() {
        return pub_time;
    }

    public void setPub_time(int pub_time) {
        this.pub_time = pub_time;
    }

    public String getImagepath() {
        return imagepath;
    }

    public void setImagepath(String imagepath) {
        this.imagepath = imagepath;
    }

    public String getImagename() {
        return imagename;
    }

    public void setImagename(String imagename) {
        this.imagename = imagename;
    }

    public String getIamgeservername() {
        return iamgeservername;
    }

    public void setIamgeservername(String iamgeservername) {
        this.iamgeservername = iamgeservername;
    }

    public int getNewscategoryid() {
        return newscategoryid;
    }

    public void setNewscategoryid(int newscategoryid) {
        this.newscategoryid = newscategoryid;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

}
