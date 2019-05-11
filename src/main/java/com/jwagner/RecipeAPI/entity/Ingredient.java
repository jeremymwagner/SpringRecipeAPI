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

    @ManyToOne
    private Recipe recipe;

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

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }
}
