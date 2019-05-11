package com.jwagner.RecipeAPI.service;

import com.jwagner.RecipeAPI.entity.Recipe;
import com.jwagner.RecipeAPI.repo.RecipeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RecipeService {

    @Autowired
    RecipeRepo recipeRepo;

    public Recipe getRecipeById(Long id){
        return recipeRepo.findRecipeById(id);
    }
}

