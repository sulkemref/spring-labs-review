package com.cydeo.model;

import com.cydeo.enums.QuantityType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Ingredient {

    private String name;
    private int quantity;
    private QuantityType quantityType;
}
