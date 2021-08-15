package com.homework.domain.core.animal.model;

import com.homework.domain.core.sk.AnimalId;
import com.homework.domain.shared.Nome;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

import static java.util.Objects.requireNonNull;
import static lombok.AccessLevel.PRIVATE;

@NoArgsConstructor(access = PRIVATE, force = true)
@Getter

@Entity
public class Animal {

    @EmbeddedId
    private final AnimalId id;

    private final Nome nome;

    private final Sexo sexo;


    public Animal(AnimalBuider buider) {
        this.id = requireNonNull(buider.id);
        this.nome =  requireNonNull(buider.nome);;
        this.sexo =  requireNonNull(buider.sexo);;
    }

    public static AnimalBuider builder(){
        return new AnimalBuider();
    }
}
