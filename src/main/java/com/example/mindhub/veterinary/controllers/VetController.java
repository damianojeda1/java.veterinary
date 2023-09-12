package com.example.mindhub.veterinary.controllers;

import com.example.mindhub.veterinary.dtos.TreatmentDTO;
import com.example.mindhub.veterinary.repositories.PetRepository;
import com.example.mindhub.veterinary.repositories.TreatmentRepository;
import com.example.mindhub.veterinary.repositories.VeterinarianRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api")
public class VetController {
    @Autowired
    private PetRepository petRepository;
    @Autowired
    private VeterinarianRepository veterinarianRepository;
    @Autowired
    private TreatmentRepository treatmentRepository;

    @GetMapping("/accounts")
    public List<TreatmentDTO> getTreatments(){
        return null;
    }

}
