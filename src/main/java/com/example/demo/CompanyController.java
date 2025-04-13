package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @GetMapping("/companies")
    public List<String> getCompanyNames() {
        return companyService.getAllCompanies()
                .stream()
                .map(Company::getCompanyName)
                .collect(Collectors.toList());
    }

    @GetMapping("/companies/{companyId}/buses")
    public List<BusDetails> getCompanyBuses(@PathVariable int companyId) {
        return companyService.getCompanyBuses(companyId);
    }

    @GetMapping("/companies/{companyId}/buses/{busId}/schedule")
    public List<BusSchedule> getBusSchedule(@PathVariable int companyId, @PathVariable int busId) {
        return companyService.getBusSchedule(companyId, busId);
    }
}
