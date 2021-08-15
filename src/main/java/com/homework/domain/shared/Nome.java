package com.homework.domain.shared;

import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

import static lombok.AccessLevel.PRIVATE;

@NoArgsConstructor(access = PRIVATE, force = true)

@Embeddable
public final class Nome {

    private final String value;

    private Nome(String value) {
        this.value = value;
    }

    public static Nome from(String value) {
        return new Nome(value);
    }
}
