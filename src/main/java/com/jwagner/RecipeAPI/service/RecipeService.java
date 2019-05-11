package com.jwagner.RecipeAPI.service;

import com.jwagner.RecipeAPI.entity.Recipe;
import com.jwagner.RecipeAPI.repo.RecipeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecipeService {

    @Autowired
    RecipeRepo recipeRepo;

    public Recipe getRecipeById(Long id){
        return recipeRepo.findById(id).get();
    }

    public List<Recipe> getUserRecipes(Long userId){
        return recipeRepo.findAllUserRecipes(userId);
    }

    public Recipe saveOrUpdateRecipe(Recipe recipe){
        return recipeRepo.save(recipe);
    }

    public Recipe deleteRecipe(Long id){
        Recipe r = getRecipeById(id);
        recipeRepo.delete(r);
        return r;
    }

    public List<Recipe> getAllRecipes(){
        return recipeRepo.findAll();
    }
}

