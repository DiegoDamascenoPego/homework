package com.homework.domain.core.animal.model;

import com.homework.domain.core.sk.AnimalId;
import com.homework.domain.shared.Nome;

public class AnimalBuider {

    protected AnimalId id;

    protected Nome nome;

    protected Sexo sexo;

    public AnimalBuider nome(Nome nome) {
        this.nome = nome;
        return this;

    }

    public AnimalBuider sexo(Sexo sexo) {
        this.sexo = sexo;
        return this;
    }

    public Animal build() {
        id = AnimalId.generate();
        return new Animal(this);
    }
}
