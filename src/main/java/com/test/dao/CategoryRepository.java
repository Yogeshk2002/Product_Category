package com.test.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
