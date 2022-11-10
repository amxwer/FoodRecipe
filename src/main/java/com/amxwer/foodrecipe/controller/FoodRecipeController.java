package com.amxwer.foodrecipe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;


@Controller
public class FoodRecipeController {


    @GetMapping("/home")
    public String homePage(Model model){
        return "home.html";
    }

    @GetMapping("/recipes")
    public String recipesPage(){
        return "recipes.html";
    }

    @GetMapping
    public String addRecipe(){
        return  "addRecipe.html";
    }

    @GetMapping("/recipe+{id}")
    public String aboutRecipe(){
        return "aboutRecipe.html";
    }

    public void addResourceHandlers(final ResourceHandlerRegistry registry){
        registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
    }

}
