package com.example.flightsbaggagechecker.services;

import com.example.flightsbaggagechecker.models.BaggageRequirement;
import com.example.flightsbaggagechecker.models.BaggageType;
import com.example.flightsbaggagechecker.models.Company;

import java.util.List;

public interface BaggageRequirementService {
//    List<BaggageRequirement> findByCompanyAndType(Company company, BaggageType type);

    List<BaggageRequirement> findAll();
}
