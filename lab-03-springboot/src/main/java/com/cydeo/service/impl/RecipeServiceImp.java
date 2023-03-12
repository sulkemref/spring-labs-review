package com.cydeo.service.impl;

import com.cydeo.enums.QuantityType;
import com.cydeo.enums.RecipeType;
import com.cydeo.model.Ingredient;
import com.cydeo.model.Recipe;
import com.cydeo.reposiory.RecipeRepository;
import com.cydeo.service.RecipeService;
import com.cydeo.service.ShareService;
import com.github.javafaker.Faker;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

import static com.cydeo.enums.QuantityType.*;
import static com.cydeo.enums.RecipeType.*;

@Component
public class RecipeServiceImp implements RecipeService {

    private final RecipeRepository recipeRepository;

    private final ShareService shareService;
    private final Faker faker;


    public RecipeServiceImp(RecipeRepository recipeRepository, ShareService shareService, Faker faker) {
        this.recipeRepository = recipeRepository;
        this.shareService = shareService;
        this.faker = faker;
    }

    @Override
    public boolean prepareRecipe() {
        Recipe recipe = new Recipe();
        recipe.setRecipeId(UUID.randomUUID());
        recipe.setName(faker.food().dish());
        recipe.setDuration(generateRandomValue());
        recipe.setPreparation(faker.lorem().paragraph(5));
        recipe.setIngredients(prepareIngredient());
        recipe.setRecipeType(BREAKFAST);
        return recipeRepository.save(recipe)&&shareService.share(recipe);
    }
    private List<Ingredient> prepareIngredient(){
        List<Ingredient> ingredientList = new ArrayList<>();

        for(int i = 0 ; i < generateRandomValue();i++){
            Ingredient ingredient = new Ingredient();
            ingredient.setName(faker.food().ingredient());
            ingredient.setQuantity(generateRandomValue());
            ingredient.setQuantityType(TBSP);
            ingredientList.add(ingredient);
        }

        return ingredientList;
    }
    private int generateRandomValue(){
        return new Random().nextInt(20);
    }
}
