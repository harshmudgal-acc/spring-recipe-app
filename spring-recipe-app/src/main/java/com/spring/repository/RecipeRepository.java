package com.spring.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.spring.domain.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe, Long>{

	 Optional<Recipe> findByDescription(String description);
}
