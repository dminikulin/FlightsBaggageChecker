package com.example.flightsbaggagechecker.repositories;

import com.example.flightsbaggagechecker.models.BaggageRequirement;
import com.example.flightsbaggagechecker.models.BaggageType;
import com.example.flightsbaggagechecker.models.Company;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BaggageRequirementRepository extends JpaRepository<BaggageRequirement, Long> {
    List<BaggageRequirement> findByCompanyAndType(Company company, BaggageType type);
}
