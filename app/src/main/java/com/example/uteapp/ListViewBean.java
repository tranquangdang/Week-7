package com.example.uteapp;

public class ListViewBean {
    int image;
    String langName, setting_info;

    public ListViewBean(){

    }

    public ListViewBean(int image, String langName, String setting_info) {
        this.image = image;
        this.langName = langName;
        this.setting_info = setting_info;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getLangName() {
        return langName;
    }

    public void setLangName(String langName) {
        this.langName = langName;
    }

    public String getSetting_info() {
        return setting_info;
    }

    public void setSetting_info(String setting_info) {
        this.setting_info = setting_info;
    }
}
