package com.github.maquirag.enni.backend.service;

import com.github.maquirag.enni.backend.repository.IngredientRepository;
import com.github.maquirag.enni.backend.repository.RecipeRepository;
import org.springframework.stereotype.Service;

@Service
public class RecipeService {

    private RecipeRepository recipeRepository;
    private IngredientRepository ingredientRepository;

    public RecipeService(RecipeRepository recipeRepository, IngredientRepository ingredientRepository) {
        this.recipeRepository = recipeRepository;
        this.ingredientRepository = ingredientRepository;
    }


}
