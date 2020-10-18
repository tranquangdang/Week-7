package com.example.uteapp;

public class ListViewBean_Profile {
    int image;
    String header, content, time;

    public ListViewBean_Profile(){

    }

    public ListViewBean_Profile(int image, String header, String content, String time) {
        this.image = image;
        this.header = header;
        this.content = content;
        this.time = time;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
