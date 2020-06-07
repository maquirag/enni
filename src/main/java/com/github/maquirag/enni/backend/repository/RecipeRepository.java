package com.github.maquirag.enni.backend.repository;

import com.github.maquirag.enni.backend.entity.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipeRepository extends JpaRepository<Recipe, Long> {
}