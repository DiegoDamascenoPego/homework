package com.homework.domain.core.animal.app;

import com.homework.domain.core.animal.model.Animal;
import com.homework.domain.core.animal.repository.AnimalDomainRepository;
import com.homework.domain.core.animal.usecase.RegistrarAnimalUseCase;
import com.homework.domain.core.sk.AnimalId;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;

@RequiredArgsConstructor

@Service
public class AnimalAppService implements RegistrarAnimalUseCase {

    private final AnimalDomainRepository repository;

    @Override
    @Validated
    public AnimalId handle(@Valid RegistrarAnimal command) {

        Animal animal = Animal.builder()
                .sexo(command.getSexo())
                .nome(command.getNome())
                .build();


        repository.save(animal);

        return animal.getId();
    }
}
