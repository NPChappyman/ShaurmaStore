package com.example.demo;
import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;
@Data
public class Shaurma {
    @NotNull
 @Size(min=5, message="Name must be at least 5 characters long")
    private String name;
    @NotNull
 @Size(min=1, message="You must choose at least 1 ingredient")
    private List<Ingredient> ingredients; // Поле для хранения выбранных ингредиентов

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
