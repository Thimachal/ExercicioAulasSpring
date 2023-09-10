package com.thima.AulaSpringThima.resources;

import com.thima.AulaSpringThima.entities.Category;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {
    public ResponseEntity<Category> findAll(){
        List<Category> list = new ArrayList<>();
        list.add(new Category(1L,"Books"));
        return null;
    }
}
