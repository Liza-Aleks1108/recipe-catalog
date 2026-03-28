package com.example.recipecatalog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.recipecatalog.entity.Ingredient;

public interface IngredientRepository extends JpaRepository<Ingredient, Long> {
}