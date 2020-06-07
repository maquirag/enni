package com.github.maquirag.enni.backend.service;

import com.github.maquirag.enni.backend.entity.Allergen;
import com.github.maquirag.enni.backend.repository.AllergenRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AllergenService {

    private AllergenRepository allergenRepository;

    public AllergenService(AllergenRepository allergenRepository) {
        this.allergenRepository = allergenRepository;
    }

    public List<Allergen> findAll() {
        return allergenRepository.findAll();
    }

    public long count() {
        return allergenRepository.count();
    }

}
