package org.example.services;

import org.example.dto.category.CategoryDTO;
import org.example.dto.common.SelectItemDTO;
import org.springframework.data.domain.Page;


import org.springframework.data.domain.Pageable;
import java.util.List;

public interface CategoryService {
    Page<CategoryDTO> getAll(Pageable pageable);
    Page<CategoryDTO> searchByName(String name, Pageable pageable);

    List<SelectItemDTO> getSelectList();
}
