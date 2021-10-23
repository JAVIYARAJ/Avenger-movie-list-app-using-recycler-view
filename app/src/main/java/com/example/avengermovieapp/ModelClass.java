package com.example.avengermovieapp;


public class ModelClass {

    private int image_id;
    private String movie_title;
    private String movie_language;
    private String movie_duration;
    private String movie_platform;

    public ModelClass(int image_id, String movie_title, String movie_language, String movie_duration, String movie_platform) {
        this.image_id = image_id;
        this.movie_title = movie_title;
        this.movie_language = movie_language;
        this.movie_duration = movie_duration;
        this.movie_platform = movie_platform;
    }

    public int getImage_id() {
        return image_id;
    }

    public String getMovie_title() {
        return movie_title;
    }

    public String getMovie_language() {
        return movie_language;
    }

    public String getMovie_duration() {
        return movie_duration;
    }

    public String getMovie_platform() {
        return movie_platform;
    }
}

