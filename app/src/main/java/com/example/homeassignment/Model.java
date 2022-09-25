package com.example.homeassignment;

public class Model {
    private int imageId;
    private String title;
    private String description;
    private String date;
    private String grade;

    public Model(int imageId, String title, String description, String date, String grade) {
        this.imageId = imageId;
        this.title = title;
        this.description = description;
        this.date = date;
        this.grade = grade;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
