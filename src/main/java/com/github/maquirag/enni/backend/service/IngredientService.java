package com.github.maquirag.enni.backend.service;

import com.github.maquirag.enni.backend.entity.Allergen;
import com.github.maquirag.enni.backend.entity.Ingredient;
import com.github.maquirag.enni.backend.repository.AllergenRepository;
import com.github.maquirag.enni.backend.repository.IngredientRepository;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class IngredientService {

    private static final Logger LOGGER = Logger.getLogger(IngredientService.class.getName());

    private IngredientRepository ingredientRepository;
    private AllergenRepository allergenRepository;

    public IngredientService(IngredientRepository ingredientRepository, AllergenRepository allergenRepository) {
        this.ingredientRepository = ingredientRepository;
        this.allergenRepository = allergenRepository;
    }

    public List<Ingredient> findAll() {
        return ingredientRepository.findAll();
    }

    public long count() {
        return ingredientRepository.count();
    }

    public void delete(Ingredient ingredient) {
        ingredientRepository.delete(ingredient);
    }

    public void save(Ingredient ingredient) {
        if (ingredient == null) {
            LOGGER.severe("Ingredient is not defined, impossible to save.");
            return;
        }
        ingredientRepository.save(ingredient);
    }

    @PostConstruct
    public void generateTestData() {
        List<Allergen> allergens = Stream
                .of(Allergen.AllergenType.values())
                .map(Allergen::new)
                .collect(Collectors.toList());
        if (allergenRepository.count() == 0) {
            allergenRepository.saveAll(allergens);
        }
        if (ingredientRepository.count() == 0) {
            ingredientRepository.save(new Ingredient(
                    "Banana", 89, 0, 23, 1,
                    Ingredient.Source.Custom,
                    Ingredient.UnitOfMeasure.Gram100,
                    Ingredient.Category.Fruit,
                    new ArrayList<Allergen>()));
            ingredientRepository.save(new Ingredient(
                    "Milk", 528, 20, 51, 36,
                    Ingredient.Source.Custom,
                    Ingredient.UnitOfMeasure.Litre,
                    Ingredient.Category.Diary,
                    allergens.stream()
                            .filter(a -> a.getAllergenType() == Allergen.AllergenType.Milk)
                            .collect(Collectors.toList())));
        }
    }

}
