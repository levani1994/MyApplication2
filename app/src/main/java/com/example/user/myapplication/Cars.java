package com.example.user.myapplication;

public class Cars {
    private String title;
    private int  thumbnail;

    public Cars() {
    }


    public Cars(String title,int thumbnail) {
        this.title = title;
        this.thumbnail = thumbnail;
    }


    public String getTitle() {
        return title;
    }


    public int getThumbnail() {
        return thumbnail;
    }

    public void setTitle(String title) {
        this.title = title;
    }





    public void setThumbnail(int thumbnail) {
        this.thumbnail = thumbnail;
    }
}
