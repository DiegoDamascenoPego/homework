package com.homework.domain.core.sk;

import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.UUID;

import static lombok.AccessLevel.PRIVATE;

@NoArgsConstructor(access = PRIVATE, force = true)

@Embeddable
public class AnimalId implements Serializable {

    public static final AnimalId NAO_INFORMADO = new AnimalId(null);

    @NotNull
    @NotBlank
    @Column(name = "produto_id")
    private final UUID value;

    private AnimalId(UUID value) {
        this.value = value;
    }

    public static AnimalId from(String value){
        return new AnimalId(UUID.fromString(value));
    }

    public static AnimalId generate(){
        return new AnimalId(UUID.randomUUID());
    }
}
