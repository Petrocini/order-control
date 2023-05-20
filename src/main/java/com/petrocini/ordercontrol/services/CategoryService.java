package com.petrocini.ordercontrol.services;

import com.petrocini.ordercontrol.entities.Category;
import com.petrocini.ordercontrol.entities.Order;
import com.petrocini.ordercontrol.repositories.CategoryRepository;
import com.petrocini.ordercontrol.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    public Category findById(Long id) {
        Optional<Category> category = categoryRepository.findById(id);
        return category.get();
    }

}

