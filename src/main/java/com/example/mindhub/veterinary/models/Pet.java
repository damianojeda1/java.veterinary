package com.example.mindhub.veterinary.models;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
public class Pet {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private Long id;

    private String name;

    private LocalDate birthDate;

    private PetType type;

    @OneToMany(mappedBy = "pet", fetch = FetchType.EAGER)
    private Set<Treatment> treatments = new HashSet<>();

    public Pet() {
    }

    public Pet(String name, LocalDate birthDate, PetType type) {
        this.name = name;
        this.birthDate = birthDate;
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public PetType getType() {
        return type;
    }

    public Set<Treatment> getTreatments() {
        return treatments;
    }

    public void addTreatment(Treatment treatment){
        this.treatments.add(treatment);
        treatment.setPet(this);
    }

}
