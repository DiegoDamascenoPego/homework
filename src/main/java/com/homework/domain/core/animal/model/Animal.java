package com.homework.domain.core.animal.model;

import com.homework.domain.shared.Descricao;
import com.homework.domain.shared.Nome;

public class Animal {

    private final Nome nome;

    private final String sexo;

    public Animal(Nome nome, String sexo) {
        this.nome = nome;
        this.sexo = sexo;
    }
}
