package com.jwagner.RecipeAPI.controller;

import com.jwagner.RecipeAPI.entity.Recipe;
import com.jwagner.RecipeAPI.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/recipes")
public class RecipeController {

    @Autowired
    RecipeService recipeService;

    @GetMapping(value = "/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public Recipe getRecipeById(@PathVariable Long id){
        return recipeService.getRecipeById(id);
    }

    @GetMapping(value="/user/{userId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Recipe> getUserRecipes(@PathVariable Long userId){
        return recipeService.getUserRecipes(userId);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Recipe createRecipe(@RequestBody Recipe recipe){
        return recipeService.saveOrUpdateRecipe(recipe);
    }

    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Recipe updateRecipe(@RequestBody Recipe recipe){
        return recipeService.saveOrUpdateRecipe(recipe);
    }

    @DeleteMapping(value="/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Recipe deleteRecipe(@PathVariable Long id){
        return recipeService.deleteRecipe(id);
    }

    @GetMapping(value = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Recipe> getAllRecipes(){
        return recipeService.getAllRecipes();
    }
}
