package com.example.demo;

import java.util.List;

public class BusSchedule {
    private String day;
    private List<String> time;

    // Getter and Setter for day
    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    // Getter and Setter for time
    public List<String> getTime() {
        return time;
    }

    public void setTime(List<String> time) {
        this.time = time;
    }
}
