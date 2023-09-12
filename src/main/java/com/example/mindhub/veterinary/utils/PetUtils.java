package com.example.mindhub.veterinary.utils;

import com.example.mindhub.veterinary.models.PetType;

import java.time.LocalDate;

public class PetUtils {

    public static int DOGLIFEHOPE = 80;

    /*
    Determina la edad de la mascota, suando la fecha de nacimiento y el tipo
    no puede ser menor a 0;
     */
    public static int determineAge(LocalDate birthDate, PetType type){
        if (birthDate.getYear()>LocalDate.now().getYear()){
            return 0;
        }
        switch (type){
            case CAT: return yearsDiffUntilNow(birthDate)*5;
            case DOG: return yearsDiffUntilNow(birthDate)*7;
            case BIRD: return yearsDiffUntilNow(birthDate)*25;
            case REPTILE: return yearsDiffUntilNow(birthDate)*1;
            default: return yearsDiffUntilNow(birthDate);
        }
    }

    //Retorna la diferencia representada en AÑOS de la fecha de nacimiento hasta hoy
    public static int yearsDiffUntilNow(LocalDate birthDate){
        return LocalDate.now().getYear() - birthDate.getYear();
    }
}
