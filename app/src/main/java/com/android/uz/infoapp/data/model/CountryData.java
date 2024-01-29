package com.android.uz.infoapp.data.model;

public class CountryData {
    private int resId;
    private String name;
    private String descreibtion;

    public CountryData(int resId, String name, String descreibtion) {
        this.resId = resId;
        this.name = name;
        this.descreibtion = descreibtion;
    }

    public int getResId() {
        return resId;
    }

    public String getName() {
        return name;
    }

    public String getDescreibtion() {
        return descreibtion;
    }
}
