package com.cydeo.enums;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum QuantityType {

    OUNCE("Ounce"), LB("LB"), TBSP("Tbsp");

    private String value;
}
