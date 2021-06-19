package com.homework.domain.shared;

import javax.persistence.Embeddable;

@Embeddable
public final class Nome {

    private final String value;

    private Nome(String value) {
        this.value = value;
    }

    static Nome from(String value) {
        return new Nome(value);
    }
}
