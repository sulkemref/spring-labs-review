package com.cydeo.enums;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum RecipeType {

    BREAKFAST("Breakfast"), LUNCH("Lunch"), DESERT("Desert"), APPETIZER("Appetizer"), BAKED("Baked"), SOUP("Soup"), VEGETERIAN("Vegeterian");

    private String value;

}
