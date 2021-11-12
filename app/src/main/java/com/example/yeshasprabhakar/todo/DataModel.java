package com.example.yeshasprabhakar.todo;

public class DataModel {

    private final String title;
    private final String date;
    private final String time;

    public DataModel(String title, String date, String time) {
        this.title = title;
        this.date = date;
        this.time = time;
    }

    public String getTitle() {
        return title;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

}
