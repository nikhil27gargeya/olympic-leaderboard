package com.dashproject.demo;


public class Athlete {
    private Long id;
    private String name;
    private String bio;
    private int height;
    private String nationality;
    private double dashTime;
    
    public Athlete(Long id, String name, String bio, int height, String nationality, double dashTime) {
        this.id = id;
        this.name = name;
        this.bio = bio;
        this.height = height;
        this.nationality = nationality;
        this.dashTime = dashTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public double getDashTime() {
        return dashTime;
    }

    public void setDashTime(double dashTime) {
        this.dashTime = dashTime;
    }
}
