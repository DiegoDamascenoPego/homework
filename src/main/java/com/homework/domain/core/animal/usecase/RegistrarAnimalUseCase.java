package com.homework.domain.core.animal.usecase;

import com.homework.domain.core.animal.model.Sexo;
import com.homework.domain.core.sk.AnimalId;
import com.homework.domain.shared.Nome;
import lombok.Builder;
import lombok.Value;

public interface RegistrarAnimalUseCase {

    AnimalId handle(RegistrarAnimal command);

    @Value
    @Builder
    class RegistrarAnimal {

        private Nome nome;

        private Sexo sexo;
    }
}
