package com.cydeo.reposiory;

import com.cydeo.model.Recipe;

public interface RecipeRepository {

    boolean save(Recipe recipe);
}
