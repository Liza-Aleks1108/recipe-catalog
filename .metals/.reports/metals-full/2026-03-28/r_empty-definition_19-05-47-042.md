error id: file:///C:/Users/Liza/Desktop/Uni/Java/recipecatalog/src/main/java/com/example/recipecatalog/controller/RecipeController.java:java/lang/Long#
file:///C:/Users/Liza/Desktop/Uni/Java/recipecatalog/src/main/java/com/example/recipecatalog/controller/RecipeController.java
empty definition using pc, found symbol in pc: 
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 1576
uri: file:///C:/Users/Liza/Desktop/Uni/Java/recipecatalog/src/main/java/com/example/recipecatalog/controller/RecipeController.java
text:
```scala
package com.example.recipecatalog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.recipecatalog.entity.Recipe;
import com.example.recipecatalog.service.CategoryService;
import com.example.recipecatalog.service.RecipeService;

@Controller
public class RecipeController {

    private final RecipeService recipeService;
    private final CategoryService categoryService;

    public RecipeController(RecipeService recipeService, CategoryService categoryService) {
        this.recipeService = recipeService;
        this.categoryService = categoryService;
    }

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("recipes", recipeService.getAllRecipes());
        return "index";
    }

    @GetMapping("/recipes/new")
    public String showCreateForm(Model model) {
        model.addAttribute("recipe", new Recipe());
        model.addAttribute("categories", categoryService.getAllCategories());
        return "recipe-form";
    }

    @PostMapping("/recipes")
    public String saveRecipe(@ModelAttribute Recipe recipe) {
        recipeService.saveRecipe(recipe);
        return "redirect:/";
    }

    @GetMapping("/recipes/{id}")
    public String viewRecipe(@PathVariable Long@@ id, Model model) {
        Recipe recipe = recipeService.getRecipeById(id);
        model.addAttribute("recipe", recipe);
        return "recipe-details";
    }

}
```


#### Short summary: 

empty definition using pc, found symbol in pc: 