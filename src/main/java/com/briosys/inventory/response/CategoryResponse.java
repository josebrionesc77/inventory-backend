package com.briosys.inventory.response;

import java.util.*;

import com.briosys.inventory.model.Category;

import lombok.Data;

@Data
public class CategoryResponse {
	
	private List<Category> category;

	public List<Category> getCategory() {
		return category;
	}

	public void setCategory(List<Category> category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "CategoryResponse [category=" + category + "]";
	}

}
