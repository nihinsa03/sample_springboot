package com.example.demo;

import java.util.List;

public class BusDetails {
    private int busId;
    private String busNo;
    private List<BusSchedule> busShedule;

    // Getter and Setter for busId
    public int getBusId() {
        return busId;
    }

    public void setBusId(int busId) {
        this.busId = busId;
    }

    // Getter and Setter for busNo
    public String getBusNo() {
        return busNo;
    }

    public void setBusNo(String busNo) {
        this.busNo = busNo;
    }

    // Getter and Setter for busShedule
    public List<BusSchedule> getBusShedule() {
        return busShedule;
    }

    public void setBusShedule(List<BusSchedule> busShedule) {
        this.busShedule = busShedule;
    }
}
