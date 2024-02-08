package com.android.uz.infoapp.data.model;

public class Country {
    private String name;
    private String capital;
    private double area;
    private String currency;
    private String language;
    private String dialingCode;
    private String timeZone;
    private String electricalOutlets;
    private String drivingSide;
    private String domain;
    private String info;

    public Country(String name, String capital, double area, String currency, String language,
                   String dialingCode, String timeZone, String electricalOutlets, String drivingSide,
                   String domain, String info) {
        this.name = name;
        this.capital = capital;
        this.area = area;
        this.currency = currency;
        this.language = language;
        this.dialingCode = dialingCode;
        this.timeZone = timeZone;
        this.electricalOutlets = electricalOutlets;
        this.drivingSide = drivingSide;
        this.domain = domain;
        this.info = info;
    }

    public String getName() {
        return name;
    }

    public String getCapital() {
        return capital;
    }

    public double getArea() {
        return area;
    }

    public String getCurrency() {
        return currency;
    }

    public String getLanguage() {
        return language;
    }

    public String getDialingCode() {
        return dialingCode;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public String getElectricalOutlets() {
        return electricalOutlets;
    }

    public String getDrivingSide() {
        return drivingSide;
    }

    public String getDomain() {
        return domain;
    }

    public String getInfo() {
        return info;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", capital='" + capital + '\'' +
                ", area=" + area +
                ", currency='" + currency + '\'' +
                ", language='" + language + '\'' +
                ", dialingCode='" + dialingCode + '\'' +
                ", timeZone='" + timeZone + '\'' +
                ", electricalOutlets='" + electricalOutlets + '\'' +
                ", drivingSide='" + drivingSide + '\'' +
                ", domain='" + domain + '\'' +
                '}';
    }
}
