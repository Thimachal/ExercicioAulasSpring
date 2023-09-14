package com.thima.AulaSpringThima.repositories;

import com.thima.AulaSpringThima.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
