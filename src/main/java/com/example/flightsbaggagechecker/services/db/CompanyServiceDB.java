package com.example.flightsbaggagechecker.services.db;

import com.example.flightsbaggagechecker.models.Company;
import com.example.flightsbaggagechecker.repositories.CompanyRepository;
import com.example.flightsbaggagechecker.services.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CompanyServiceDB implements CompanyService {

    @Autowired
    private CompanyRepository companyRepository;

    @Override
    public List<Company> findAll() {
        return companyRepository.findAll();
    }
}
