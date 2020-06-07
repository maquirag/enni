package com.github.maquirag.enni.backend.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
public class Ingredient extends AbstractEntity implements Cloneable {

    public enum Source {
        Custom, Nutritionix
    }

    public enum UnitOfMeasure {
        Gram100, Cup, Litre, Sprinkle
    }

    public enum Category {
        Diary, Meat, Vegetable, Legume, Fruit, Grain, Nut, Other
    }

    @NotNull
    private String name = "";

    private int kcal;
    private int fat;
    private int carb;
    private int protein;

    @Enumerated(EnumType.STRING)
    @NotNull
    private Ingredient.Source source;

    @Enumerated(EnumType.STRING)
    @NotNull
    private Ingredient.UnitOfMeasure uom;

    @Enumerated(EnumType.STRING)
    @NotNull
    private Ingredient.Category category;

    @ManyToMany
    @JoinTable(
            name = "ingredient_allergen",
            joinColumns = @JoinColumn(name = "ingredient_id"),
            inverseJoinColumns = @JoinColumn(name = "allergen_id"))
    private List<Allergen> allergens;


    public Ingredient() {
    }

    public Ingredient(String name, int kcal, int fat, int carb, int protein,
                      Ingredient.Source source,
                      Ingredient.UnitOfMeasure uom,
                      Ingredient.Category category,
                      List<Allergen> allergens) {
        this.name = name;
        this.kcal = kcal;
        this.fat = fat;
        this.carb = carb;
        this.protein = protein;
        this.source = source;
        this.uom = uom;
        this.category = category;
        this.allergens = allergens;
    }

    public String getName() {
        return name;
    }

    public int getKcal() {
        return kcal;
    }

    public int getFat() {
        return fat;
    }

    public int getCarb() {
        return carb;
    }

    public int getProtein() {
        return protein;
    }

    public Source getSource() {
        return source;
    }

    public UnitOfMeasure getUom() {
        return uom;
    }

    public Category getCategory() {
        return category;
    }

    public List<Allergen> getAllergens() {
        return allergens;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setKcal(int kcal) {
        this.kcal = kcal;
    }

    public void setFat(int fat) {
        this.fat = fat;
    }

    public void setCarb(int carb) {
        this.carb = carb;
    }

    public void setProtein(int protein) {
        this.protein = protein;
    }

    public void setSource(Source source) {
        this.source = source;
    }

    public void setUom(UnitOfMeasure uom) {
        this.uom = uom;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public void setAllergens(List<Allergen> allergens) {
        this.allergens = allergens;
    }
}
