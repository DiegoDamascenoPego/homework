package com.homework.infra.config.jpa;

import org.hibernate.engine.config.spi.ConfigurationService;

import javax.money.CurrencyUnit;
import javax.money.Monetary;
import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = true)
public class CurrencyUnitConverter implements AttributeConverter<CurrencyUnit, String> {

    @Override
    public String convertToDatabaseColumn(CurrencyUnit attribute) {
        return attribute.getCurrencyCode();
    }

    @Override
    public CurrencyUnit convertToEntityAttribute(String dbData) {
        return Monetary.getCurrency(dbData);
    }
}
