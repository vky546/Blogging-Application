package com.javaproject.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaproject.blog.entities.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer>{

}
