package com.example.mindhub.veterinary.utils;

import com.example.mindhub.veterinary.models.PetType;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.time.LocalDate;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace.NONE;

@DataJpaTest
@AutoConfigureTestDatabase(replace = NONE)
class PetUtilsTest {

    @Test
    void determineAge() {
        int age = PetUtils.determineAge(LocalDate.now().plusYears(2), PetType.REPTILE);
        assertThat(age, greaterThanOrEqualTo(0));
    }

}