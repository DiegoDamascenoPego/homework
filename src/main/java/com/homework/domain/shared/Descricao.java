package com.homework.domain.shared;

import javax.persistence.Embeddable;

@Embeddable
public final class Descricao {

    private final String value;

    private Descricao(String value) {
        this.value = value;
    }

    static Descricao from(String value) {
        return new Descricao(value);
    }
}
