package com.homework.adapter.in;

import com.homework.domain.core.animal.usecase.RegistrarAnimalUseCase;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

import static com.homework.domain.core.animal.usecase.RegistrarAnimalUseCase.RegistrarAnimal;

@AllArgsConstructor

@RestController
@RequestMapping(path = "/animais")
public class AnimalController {

    private final RegistrarAnimalUseCase service;

    @PostMapping
    public void registrar(@Valid @RequestBody RegistrarAnimal command) {
        service.handle(command);
    }

}
