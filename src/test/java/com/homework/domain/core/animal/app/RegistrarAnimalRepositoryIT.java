package com.homework.domain.core.animal.app;

import com.homework.domain.core.animal.model.Animal;
import com.homework.domain.core.animal.model.Sexo;
import com.homework.domain.core.animal.repository.AnimalDomainRepository;
import com.homework.domain.shared.Nome;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
public class RegistrarAnimalRepositoryIT {

    @Autowired
    AnimalDomainRepository repository;

    @Test
    void deveRegistrarAnimal(){

        Animal animal = Animal.builder()
                .sexo(Sexo.MACHO)
                .nome(Nome.from("MIA"))
                .build();

        repository.save(animal);

        Assertions.assertNotNull(repository.findById(animal.getId()));
    }
}
