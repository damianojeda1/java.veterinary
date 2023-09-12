package com.example.mindhub.veterinary.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
public class Veterinarian {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private Long id;

    private String name;

    @OneToMany(mappedBy = "veterinarian", fetch = FetchType.EAGER)
    private Set<Treatment> treatments = new HashSet<>();

    public Veterinarian() {
    }

    public Veterinarian(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addTreatment(Treatment treatment){
        this.treatments.add(treatment);
        treatment.setVeterinarian(this);
    }

    public Set<Treatment> getTreatments() {
        return treatments;
    }
}
