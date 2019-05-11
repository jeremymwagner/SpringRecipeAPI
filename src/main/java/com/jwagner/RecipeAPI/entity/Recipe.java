package com.jwagner.RecipeAPI.entity;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="Recipe")
public class Recipe {
    @Id
    @GeneratedValue
    @Column(name="recipe_id")
    private Long id;

    @Column(name="title")
    private String title;

    @Column(name="directions")
    private String directions;

    @Column(name="calories")
    private Integer calories;

    @Column(name="total_time")
    private String time;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="recipe_id")
    private List<Ingredient> ingredients;

    @Column(name="user_id")
    private Long user_id;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirections() {
        return directions;
    }

    public void setDirections(String directions) {
        this.directions = directions;
    }

    public Integer getCalories() {
        return calories;
    }

    public void setCalories(Integer calories) {
        this.calories = calories;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }
}
