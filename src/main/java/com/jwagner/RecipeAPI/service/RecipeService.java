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
        List<Recipe> list = recipeRepo.findAll();
        return list.get(0);
    }
}

