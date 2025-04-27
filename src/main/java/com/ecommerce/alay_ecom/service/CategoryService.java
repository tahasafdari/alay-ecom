package com.ecommerce.alay_ecom.service;

import com.ecommerce.alay_ecom.model.Category;


import java.util.List;

public interface CategoryService {
    List<Category> getAllCategories();
    void createCategory(Category category);
    String deleteCategory(long categoryId);

    Category updateCategory(Category category, long categoryId);
}
