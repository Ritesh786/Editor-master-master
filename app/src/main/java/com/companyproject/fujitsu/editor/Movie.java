package com.companyproject.fujitsu.editor;

/**
 * Created by Fujitsu on 10/06/2017.
 */

public class Movie {

    private String title, thumbnailUrl;
    private String year;
    private String rating;
    private String  genre;
    private String id;
    private String caption;


    public Movie() {
    }

    public Movie(String name, String thumbnailUrl, String year, String rating,
                 String genre,String id,String caption) {
        this.title = name;
        this.thumbnailUrl = thumbnailUrl;
        this.year = year;
        this.rating = rating;
        this.genre = genre;
        this.id = id;
        this.caption = caption;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String name) {
        this.title = name;
    }

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

}

