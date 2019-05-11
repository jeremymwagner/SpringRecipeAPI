package com.jwagner.RecipeAPI.service;

import com.jwagner.RecipeAPI.entity.Ingredient;
import com.jwagner.RecipeAPI.repo.IngredientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IngredientService {

    @Autowired
    IngredientRepo ingredientRepo;

    public Ingredient getIngredientById(Long id){
        return ingredientRepo.findById(id).get();
    }

    public List<Ingredient> getRecipeIngredients(Long recipeId){
        return ingredientRepo.getAllIngredientsForRecipe(recipeId);
    }

    public Ingredient createOrUpdate(Ingredient ingredient){
        return ingredientRepo.save(ingredient);
    }

    public Ingredient deleteIngredient(Long id){
        Ingredient i = getIngredientById(id);
        ingredientRepo.delete(i);
        return i;
    }
}
