package com.example.recipecatalog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.recipecatalog.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}