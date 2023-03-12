package com.cydeo.model;

import com.cydeo.enums.RecipeType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Recipe {

    private UUID recipeId;
    private String name;
    private int duration;
    private String preparation;
    private List<Ingredient> ingredients;
    private RecipeType recipeType;

    @Override
    public String toString() {
        return "Recipe{" +
                "name='" + name + '\'' +
                ", duration=" + duration +" minutes"+
                ", preparation=" + preparation +" minutes"+
                ", ingredients=" + ingredients.toString().replaceAll("Ingredients","") +
                ", recipeType=" + recipeType +
                '}';
    }
}
