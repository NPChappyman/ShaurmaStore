package com.example.demo;
import java.util.HashMap;
import java.util.Map;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.example.demo.Ingredient.Type;
@Component
public class IngredientByIdConverter implements Converter<String, Ingredient> {
 private Map<String, Ingredient> ingredientMap = new HashMap<>();
 public IngredientByIdConverter() {
    ingredientMap.put("TOBA", new Ingredient("TOBA", "Tomato Bakinsky",Type.VEGGIES));
    ingredientMap.put("MAYA",new Ingredient("MAYA","Mayanez",Type.SAUCE));
    ingredientMap.put("LAVA",new Ingredient("LAVA", "Lavash", Type.WRAP));
    ingredientMap.put("CHEE",new Ingredient("CHEE", "Cheese", Type.CHEESE));
    ingredientMap.put("OGUR", new Ingredient("OGUR", "Ogurez simple", Type.VEGGIES));
    ingredientMap.put("OGSO",new Ingredient("OGSO", "Ogurez solyuoniy", Type.VEGGIES));
    ingredientMap.put("CHED",new Ingredient("CHED", "Cheddar", Type.CHEESE));
    ingredientMap.put("KURA",new Ingredient("KURA", "Kurochka", Type.PROTEIN));
    ingredientMap.put("GOVA",new Ingredient("GOVA", "Govyadina", Type.PROTEIN));
    ingredientMap.put("SALA",new Ingredient("SALA", "SALAT", Type.VEGGIES));
    }
    @Override
    public Ingredient convert(String id) {
    return ingredientMap.get(id);
 }
}