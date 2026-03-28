error id: file:///C:/Users/Liza/Desktop/Uni/Java/recipecatalog/src/main/java/com/example/recipecatalog/controller/RecipeController.java:_empty_/Model#addAttribute#
file:///C:/Users/Liza/Desktop/Uni/Java/recipecatalog/src/main/java/com/example/recipecatalog/controller/RecipeController.java
empty definition using pc, found symbol in pc: _empty_/Model#addAttribute#
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 946
uri: file:///C:/Users/Liza/Desktop/Uni/Java/recipecatalog/src/main/java/com/example/recipecatalog/controller/RecipeController.java
text:
```scala
package com.example.recipecatalog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
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

    @GetMapping("/recipes/new")
    public String showCreateForm(Model model) {
        model.addAttribute@@("recipe", new Recipe());
        model.addAttribute("categories", java.util.Collections.emptyList());
        return "recipe-form";
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
}
```


#### Short summary: 

empty definition using pc, found symbol in pc: _empty_/Model#addAttribute#