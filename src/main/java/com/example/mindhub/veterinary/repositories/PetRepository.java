package com.example.mindhub.veterinary.repositories;

import com.example.mindhub.veterinary.models.Pet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PetRepository extends JpaRepository<Pet,Long> {
}
