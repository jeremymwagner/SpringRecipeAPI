package com.jwagner.RecipeAPI.entity;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="Recipe")
public class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "recipe_generator")
    @SequenceGenerator(name="recipe_generator",sequenceName = "recipe_seq")
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

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }
}
