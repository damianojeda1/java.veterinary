package com.example.mindhub.veterinary;

import com.example.mindhub.veterinary.models.Pet;
import com.example.mindhub.veterinary.models.PetType;
import com.example.mindhub.veterinary.models.Treatment;
import com.example.mindhub.veterinary.models.Veterinarian;
import com.example.mindhub.veterinary.repositories.PetRepository;
import com.example.mindhub.veterinary.repositories.TreatmentRepository;
import com.example.mindhub.veterinary.repositories.VeterinarianRepository;
import com.example.mindhub.veterinary.utils.PetUtils;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;

@SpringBootApplication
public class VeterinaryApplication {

	public static void main(String[] args) {
		SpringApplication.run(VeterinaryApplication.class, args);
	}

	@Bean
	CommandLineRunner initData(PetRepository petRepository, VeterinarianRepository veterinarianRepository,
							   TreatmentRepository treatmentRepository){
		return ( args )->{
			Veterinarian vet1 = new Veterinarian("Dr. Muela");
			Veterinarian vet2 = new Veterinarian("Dr. Pepino");
			veterinarianRepository.save(vet1);
			veterinarianRepository.save(vet2);

			LocalDate today = LocalDate.now();

			Pet pet1 = new Pet("Luna", today.minusYears(5), PetType.DOG);
			Pet pet2 = new Pet("Mamba", today.minusYears(5), PetType.DOG);
			Pet pet3 = new Pet("Tuki", today.minusYears(5), PetType.BIRD);
			Pet pet4 = new Pet("Nora", today.minusYears(5), PetType.CAT);
			Pet pet5 = new Pet("Pocho", today.minusYears(5), PetType.DOG);
			petRepository.save(pet1);
			petRepository.save(pet2);
			petRepository.save(pet3);
			petRepository.save(pet4);
			petRepository.save(pet5);

			Math.random();

			int petYears = PetUtils.determineAge(pet1.getBirthDate(), pet1.getType());

			System.out.println("Mi mascota "+pet1.getName()+
					" tiene "+petYears+" años"+
					"\nLe quedan "+(PetUtils.DOGLIFEHOPE-petYears)+" años de vida");


			Treatment treatment1 = new Treatment("Virus");
			Treatment treatment2 = new Treatment("Bacteria");
			Treatment treatment3 = new Treatment("Cirujia");
			Treatment treatment4 = new Treatment("Cirujia");

			pet1.addTreatment(treatment1);
			vet1.addTreatment(treatment1);

			treatmentRepository.save(treatment1);

			//Pruba cambio


		};
	}

}
