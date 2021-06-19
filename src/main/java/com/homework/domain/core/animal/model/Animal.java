package com.homework.domain.core.animal.model;

import com.homework.domain.shared.Descricao;

public class Animal {

    private final Descricao descricao;

    private final String sexo;

    public Animal(Descricao descricao, String sexo) {
        this.descricao = descricao;
        this.sexo = sexo;
    }
}
