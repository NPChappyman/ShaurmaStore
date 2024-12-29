package com.example.demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.example.demo.Ingredient.Type;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/design")
@SessionAttributes("shaurmaOrder")
public class DesignShaurmaController {
    
        @ModelAttribute
        public void addIngredientsToModel(Model model) {
            List<Ingredient> ingredients = Arrays.asList(
               new Ingredient("TOBA","Tomato Bakinsky",Type.VEGGIES),
               new Ingredient("MAYA","Mayanez",Type.SAUCE),
               new Ingredient("LAVA", "Lavash", Type.WRAP),
               new Ingredient("CHEE", "Cheese", Type.CHEESE),
               new Ingredient("OGUR", "Ogurez simple", Type.VEGGIES),
               new Ingredient("OGSO", "Ogurez solyuoniy", Type.VEGGIES),
               new Ingredient("KURA", "Kurochka", Type.PROTEIN),
               new Ingredient("GOVA", "Govyadina", Type.PROTEIN),
               new Ingredient("SALA", "SALAT", Type.VEGGIES)
            );
            Type[] types = Ingredient.Type.values();
            for (Type type : types) {
            model.addAttribute(type.toString().toLowerCase(),filterByType(ingredients, type));
            }
            
            
            }
            @ModelAttribute(name = "shaurmaOrder")
            public ShaurmaOrder order() {
            return new ShaurmaOrder();
            }
            @ModelAttribute(name = "shaurma")
            public Shaurma shaurma() {
            return new Shaurma();
            }
            @GetMapping
            public String showDesignForm() {
            return "design";
            }
            
            private Iterable<Ingredient> filterByType(List<Ingredient> ingredients, Type type) {
            return ingredients.stream().filter(x -> x.getType().equals(type)).collect(Collectors.toList());
            }
            @PostMapping
            public String processShaurma(Shaurma shaurma, @ModelAttribute ShaurmaOrder shaurmaOrder) {
                    shaurmaOrder.addShaurma(shaurma);
                    log.info("Processing shaurma: {}", shaurma);
                return "redirect:/orders/current";
}
}
