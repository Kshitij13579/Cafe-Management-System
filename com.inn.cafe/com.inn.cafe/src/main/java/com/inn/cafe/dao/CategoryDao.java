package com.inn.cafe.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inn.cafe.pojo.Category;

public interface CategoryDao extends JpaRepository<Category, Integer> {
	
	List<Category> getAllCategory();
	
}
