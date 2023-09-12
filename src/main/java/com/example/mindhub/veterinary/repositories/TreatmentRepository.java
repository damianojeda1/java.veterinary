package com.example.mindhub.veterinary.repositories;

import com.example.mindhub.veterinary.models.Treatment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TreatmentRepository extends JpaRepository<Treatment,Long> {
}
