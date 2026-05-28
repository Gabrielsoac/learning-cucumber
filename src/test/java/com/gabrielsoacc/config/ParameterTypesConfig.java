package com.gabrielsoacc.config;

import java.math.BigDecimal;

import io.cucumber.java.ParameterType;

public class ParameterTypesConfig {

    @ParameterType("[0-9.,]+")
    public BigDecimal money(String value){
        value = value.replace(".", "").replace(",", ".");
        return BigDecimal.valueOf(Double.valueOf(value));
    }
}
