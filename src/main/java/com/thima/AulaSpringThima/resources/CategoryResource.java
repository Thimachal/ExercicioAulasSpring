package com.thima.AulaSpringThima.resources;

import com.thima.AulaSpringThima.entities.Category;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {
    public ResponseEntity<Category> findAll(){

        return null;
    }
}
