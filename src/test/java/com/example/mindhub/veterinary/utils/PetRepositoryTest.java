package com.example.mindhub.veterinary.utils;

import com.example.mindhub.veterinary.models.Pet;
import com.example.mindhub.veterinary.models.PetType;
import com.example.mindhub.veterinary.repositories.PetRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace.NONE;

@DataJpaTest
@AutoConfigureTestDatabase(replace = NONE)
class PetRepositoryTest {

    @Autowired
    PetRepository petRepository;

    //Verificar que siempre exista al menos una mascota insertada
    @Test
    void existAnyPet(){
        List<Pet> pets = petRepository.findAll();
        //Chequear que exista al menos una mascota
        assertThat(pets, not(empty()));
    }


    //Verificar que mi gata (Luna) sea una de las mascotas
    @Test
    void existMyPet(){
        List<Pet> pets = petRepository.findAll();
        assertThat(pets, allOf(hasItem(hasProperty("name", is("Luna"))),
                               hasItem(hasProperty("type", is(PetType.CAT)))));
    }


}