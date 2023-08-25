package com.briosys.inventory.services;

import org.springframework.http.ResponseEntity;
import com.briosys.inventory.response.*;

public interface ICategoryService {
	
	public ResponseEntity<CategoryResponseRest> search();
	

}
