package com.example.demo;
import java.util.Date;
import java.util.List;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class Shaurma {
    
 @Size(min=5, message="Name must be at least 5 characters long")
    private String name;
   
    @NotEmpty(message = "You must choose at least 1 ingredient")
    private List<Ingredient> ingredients; // Поле для хранения выбранных ингредиентов
    private Long id;
    private Date createdAt = new Date();
   
    // Геттер для ingredients
    public List<Ingredient> getIngredients() {
        return ingredients;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    // Сеттер для ingredients
    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }
    @Override
    public String toString() {
        return "Shaurma{" +
                "name='" + name + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}
