package com.example.fessutival.schedule;

public class Event {
    private String title;
    private String time;

    public Event(String title, String time) {
        this.title = title;
        this.time = time;
    }

    public String getTitle() {
        return title;
    }

    public String getTime() {
        return time;
    }
}