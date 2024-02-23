package org.example.services;

import lombok.AllArgsConstructor;
import org.example.dto.CategoryDTO;
import org.example.entities.CategoryEntity;
import org.example.mapper.CategoryMapper;
import org.example.repositories.CategoryRepository;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Pageable;


@Service
@AllArgsConstructor
public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepository categoryRepository;
    private final CategoryMapper categoryMapper;

    @Override
    public Page<CategoryDTO> getAll(Pageable pageable) {
        Page<CategoryEntity> categories = categoryRepository.findAll(pageable);
        return categories.map(categoryMapper::categoryItemDTO);
    }
}
