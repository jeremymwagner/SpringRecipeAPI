package com.jwagner.RecipeAPI.repo;

import com.jwagner.RecipeAPI.entity.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RecipeRepo extends JpaRepository<Recipe, Long> {

    @Query("SELECT r FROM Recipe r WHERE recipe_id = ?1")
    Recipe findRecipeById(Long id);

    @Query("SELECT r FROM Recipe r where r.user_id = ?1")
    List<Recipe> findAllUserRecipes(Long userId);
}
