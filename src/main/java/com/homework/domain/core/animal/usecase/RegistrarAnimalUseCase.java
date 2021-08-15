package com.homework.domain.core.animal.usecase;

import com.homework.domain.core.animal.model.Sexo;
import com.homework.domain.core.sk.AnimalId;
import com.homework.domain.shared.Nome;
import lombok.Builder;
import lombok.Value;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

public interface RegistrarAnimalUseCase {

    AnimalId handle(RegistrarAnimal command);

    @Value
    @Builder
    class RegistrarAnimal {

        @NotNull
        @Valid
        private Nome nome;

        @NotNull
        private Sexo sexo;
    }
}
