package com.jwagner.RecipeAPI.controller;

import com.jwagner.RecipeAPI.entity.Ingredient;
import com.jwagner.RecipeAPI.service.IngredientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ingredients")
public class IngredientController {

    @Autowired
    IngredientService ingredientService;

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Ingredient getIngredientById(@PathVariable Long id){
        return ingredientService.getIngredientById(id);
    }

    @GetMapping(value = "/recipe/{recipeId}",produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Ingredient> getIngredientsForRecipe(@PathVariable Long recipeId){
        return ingredientService.getRecipeIngredients(recipeId);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public Ingredient addIngredientToRecipe(@RequestBody Ingredient ingredient){
        return ingredientService.createOrUpdate(ingredient);
    }

    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Ingredient updateIngredient(@RequestBody Ingredient ingredient){
        return ingredientService.createOrUpdate(ingredient);
    }

    @DeleteMapping(value = "/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public Ingredient removeIngredient(@PathVariable Long id){
        return ingredientService.deleteIngredient(id);
    }

    @DeleteMapping(value = "/recipe/{recipeId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Long clearIngredientsFromRecipe(@PathVariable Long recipeId){
        return ingredientService.clearIngredientsFromRecipe(recipeId);
    }

    @GetMapping(value = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Ingredient> getAllIngredients(){
        return ingredientService.getAllIngredients();
    }
}
