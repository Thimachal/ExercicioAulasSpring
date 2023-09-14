package com.thima.AulaSpringThima.services;

import com.thima.AulaSpringThima.entities.Category;
import com.thima.AulaSpringThima.repositories.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    private CategoryRepository repository;
    public List<Category> findAll(){

    }
}
