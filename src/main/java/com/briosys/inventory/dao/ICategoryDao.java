package com.briosys.inventory.dao;

import org.springframework.data.repository.CrudRepository;

import com.briosys.inventory.model.Category;

public interface ICategoryDao extends CrudRepository<Category, Long> {
	
	

}
