package com.github.maquirag.enni.backend.entity;

import org.hibernate.validator.constraints.UniqueElements;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Entity
public class Allergen extends AbstractEntity implements Cloneable {

    public enum AllergenType {
        Wheat, Milk, Egg, Soy, Nuts
    }

    @Enumerated(EnumType.STRING)
    @Column(unique = true)
    @NotNull
    private Allergen.AllergenType allergenType;

    @ManyToMany(mappedBy = "allergens")
    private Set<Ingredient> ingredients;

    public Allergen() { }

    public Allergen(AllergenType allergenType) {
        setAllergenType(allergenType);
    }

    public AllergenType getAllergenType() {
        return allergenType;
    }

    public void setAllergenType(AllergenType allergenType) {
        this.allergenType = allergenType;
    }

    public Set<Ingredient> getIngredients() {
        return ingredients;
    }
}
