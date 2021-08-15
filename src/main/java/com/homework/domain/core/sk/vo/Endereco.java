package com.homework.domain.core.sk.vo;

import lombok.Getter;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;

@Getter
@Embeddable
public class Endereco {

    private String cidade;

    public Endereco(String cidade) {
        this.cidade = cidade;
    }
}
