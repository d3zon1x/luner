package org.example.services;

import org.example.dto.CategoryDTO;
import org.springframework.data.domain.Page;


import org.springframework.data.domain.Pageable;

public interface CategoryService {
    Page<CategoryDTO> getAll(Pageable pageable);
}
