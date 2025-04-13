package com.example.demo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "Companies")
public class Company {
    @Id
    private String id;
    private int companyId;
    private String companyName;
    private List<BusDetails> busDetails;

    // Getter and Setter for id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    // Getter and Setter for companyId
    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    // Getter and Setter for companyName
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    // Getter and Setter for busDetails
    public List<BusDetails> getBusDetails() {
        return busDetails;
    }

    public void setBusDetails(List<BusDetails> busDetails) {
        this.busDetails = busDetails;
    }
}
