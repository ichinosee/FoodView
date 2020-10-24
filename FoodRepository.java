package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodRepository extends JpaRepository<Food, Integer>{
	List<Food> findByCategoryCode(Integer categoryCode);
	List<Food> findByNameLike(String name);
}
