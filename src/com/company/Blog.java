package com.company;

/**
 * Created by truongpq on 10/05/2017.
 */
public class Blog {
    private int id;
    private String title;
    private String link_audio;
    private String link_img;
    private int count_like;
    private int count_listen;
    private int count_cmt;
    private String day_add;

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

    public String getLink_audio() {
        return link_audio;
    }

    public void setLink_audio(String link_audio) {
        this.link_audio = link_audio;
    }

    public String getLink_img() {
        return link_img;
    }

    public void setLink_img(String link_img) {
        this.link_img = link_img;
    }

    public int getCount_like() {
        return count_like;
    }

    public void setCount_like(int count_like) {
        this.count_like = count_like;
    }

    public int getCount_listen() {
        return count_listen;
    }

    public void setCount_listen(int count_listen) {
        this.count_listen = count_listen;
    }

    public int getCount_cmt() {
        return count_cmt;
    }

    public void setCount_cmt(int count_cmt) {
        this.count_cmt = count_cmt;
    }

    public String getDay_add() {
        return day_add;
    }

    public void setDay_add(String day_add) {
        this.day_add = day_add;
    }
}
