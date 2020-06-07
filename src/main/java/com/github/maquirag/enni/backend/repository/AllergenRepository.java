package com.github.maquirag.enni.backend.repository;

import com.github.maquirag.enni.backend.entity.Allergen;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AllergenRepository extends JpaRepository<Allergen, Long> {
}