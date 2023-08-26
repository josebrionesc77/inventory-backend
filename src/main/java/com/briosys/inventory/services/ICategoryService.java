package com.briosys.inventory.services;

import org.springframework.http.ResponseEntity;

import com.briosys.inventory.model.Category;
import com.briosys.inventory.response.*;

public interface ICategoryService {
	
	public ResponseEntity<CategoryResponseRest> search();
	
	public ResponseEntity<CategoryResponseRest> searchById(Long id);
	
	public ResponseEntity<CategoryResponseRest> save(Category category);
	
	public ResponseEntity<CategoryResponseRest> Update(Category category, Long id);
	
	public ResponseEntity<CategoryResponseRest> deleteById(Long id);

}
