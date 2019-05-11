package com.jwagner.RecipeAPI.controller;

import com.jwagner.RecipeAPI.entity.Recipe;
import com.jwagner.RecipeAPI.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/recipes")
public class RecipeController {

    @Autowired
    RecipeService recipeService;

    @GetMapping(value = "/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public Recipe getRecipeById(@PathVariable Long id){
        return recipeService.getRecipeById(id);
    }
}
