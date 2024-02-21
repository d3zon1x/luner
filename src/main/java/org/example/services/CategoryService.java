package org.example.services;

import org.example.dto.CategoryDTO;
import org.springframework.data.domain.Page;


import java.awt.print.Pageable;

public interface CategoryService {
    Page<CategoryDTO> getAll(Pageable pageable);
}
