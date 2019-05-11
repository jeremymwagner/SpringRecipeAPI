package com.jwagner.RecipeAPI.repo;

import com.jwagner.RecipeAPI.entity.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IngredientRepo extends JpaRepository<Ingredient, Long> {

    @Query("SELECT i FROM Ingredient i WHERE i.recipe_id = ?1")
    List<Ingredient> getAllIngredientsForRecipe(Long recipeId);

    @Query("DELETE FROM Ingredient i WHERE i.recipe_id = ?1")
    Long clearAllIngredientsForRecipe(Long recipeId);
}
