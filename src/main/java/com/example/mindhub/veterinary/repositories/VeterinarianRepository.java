package com.example.mindhub.veterinary.repositories;

import com.example.mindhub.veterinary.models.Veterinarian;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VeterinarianRepository extends JpaRepository<Veterinarian,Long> {
}
