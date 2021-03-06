package com.example.linerapp.app.model;

/**
 * Created by Ильнар on 10.07.2014.
 */
public class Line {

    private int id;

    private String name;

    private String description;

    private String shortUrl;

    public Line(int id, String name, String description, String shortUrl) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.shortUrl = shortUrl;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getShortUrl() {
        return shortUrl;
    }

    public void setShortUrl(String shortUrl) {
        this.shortUrl = shortUrl;
    }
}
