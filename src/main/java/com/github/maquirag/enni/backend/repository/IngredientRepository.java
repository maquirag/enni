package com.github.maquirag.enni.backend.repository;

import com.github.maquirag.enni.backend.entity.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngredientRepository extends JpaRepository<Ingredient, Long> {
}