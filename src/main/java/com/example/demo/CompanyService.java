package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CompanyService {

    @Autowired
    private CompanyRepository companyRepository;

    public List<Company> getAllCompanies() {
        return companyRepository.findAll();
    }

    public List<BusDetails> getCompanyBuses(int companyId) {
        Company company = companyRepository.findByCompanyId(companyId);
        return company != null ? company.getBusDetails() : null;
    }

    public List<BusSchedule> getBusSchedule(int companyId, int busId) {
        Company company = companyRepository.findByCompanyId(companyId);
        if (company != null) {
            for (BusDetails bus : company.getBusDetails()) {
                if (bus.getBusId() == busId) {
                    return bus.getBusShedule();
                }
            }
        }
        return null;
    }
}
