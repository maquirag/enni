package com.github.maquirag.enni.backend.entity;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

@Entity
public class Recipe extends AbstractEntity implements Cloneable {

    @NotNull
    private String name;

    // TODO: many-to-many releationship with ingredients

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
