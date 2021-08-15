package com.homework.domain.core.animal.app;

import com.homework.domain.core.animal.model.Animal;
import com.homework.domain.core.animal.model.Sexo;
import com.homework.domain.core.animal.repository.AnimalDomainRepository;
import com.homework.domain.shared.Nome;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class RegistrarAnimalMockTest {

    AnimalDomainRepository repository;

    @BeforeEach
    void beforeEach(){
        repository = Mockito.mock(AnimalDomainRepository.class);
    }


    @Test
    void deveRegistrarAnimal(){

        Animal animal = Animal.builder()
                .sexo(Sexo.MACHO)
                .nome(Nome.from("MIA"))
                .build();

        repository.save(animal);

        Mockito.verify(repository).save(animal);
    }

}