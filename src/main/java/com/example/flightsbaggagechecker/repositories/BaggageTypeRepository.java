package com.example.flightsbaggagechecker.repositories;

import com.example.flightsbaggagechecker.models.BaggageType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BaggageTypeRepository extends JpaRepository<BaggageType, Long> {
}
