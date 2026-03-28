error id: file:///C:/Users/Liza/Desktop/Uni/Java/recipecatalog/src/main/java/com/example/recipecatalog/controller/CategoryController.java:_empty_/Model#addAttribute#
file:///C:/Users/Liza/Desktop/Uni/Java/recipecatalog/src/main/java/com/example/recipecatalog/controller/CategoryController.java
empty definition using pc, found symbol in pc: _empty_/Model#addAttribute#
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 988
uri: file:///C:/Users/Liza/Desktop/Uni/Java/recipecatalog/src/main/java/com/example/recipecatalog/controller/CategoryController.java
text:
```scala
package com.example.recipecatalog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.recipecatalog.entity.Category;
import com.example.recipecatalog.service.CategoryService;

@Controller
@RequestMapping("/categories")
public class CategoryController {

    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping
    public String listCategories(Model model) {
        model.addAttribute("categories", categoryService.getAllCategories());
        model.addAtt@@ribute("category", new Category());
        return "categories";
    }

    @PostMapping
    public String addCategory(@ModelAttribute Category category) {
        categoryService.saveCategory(category);
        return "redirect:/categories";
    }

    @GetMapping("/delete/{id}")
    public String deleteCategory(@PathVariable Long id) {
        categoryService.deleteCategory(id);
        return "redirect:/categories";
    }
}
```


#### Short summary: 

empty definition using pc, found symbol in pc: _empty_/Model#addAttribute#