package com.jwagner.RecipeAPI.entity;

import javax.persistence.*;

@Entity
@Table(name="Ingredient")
public class Ingredient {
    @Id
    @GeneratedValue
    @Column(name="ingredient_id")
    private Long id;

    @Column(name="name")
    private String name;

    @Column(name="amount")
    private Double amount;

    @Column(name="measurement")
    private String measurement;

    @Column(name="recipe_id")
    private Long recipe_id;

    public Ingredient() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getMeasurement() {
        return measurement;
    }

    public void setMeasurement(String measurement) {
        this.measurement = measurement;
    }

    public Long getRecipe_id() {
        return recipe_id;
    }

    public void setRecipe_id(Long recipe_id) {
        this.recipe_id = recipe_id;
    }
}
