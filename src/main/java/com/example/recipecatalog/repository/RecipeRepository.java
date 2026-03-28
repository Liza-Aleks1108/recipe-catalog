package com.example.recipecatalog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.recipecatalog.entity.Recipe;

public interface RecipeRepository extends JpaRepository<Recipe, Long> {
}