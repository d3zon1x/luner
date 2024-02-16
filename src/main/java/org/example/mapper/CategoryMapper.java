package org.example.mapper;


import org.example.dto.CategoryCreateDTO;
import org.example.dto.CategoryDTO;
import org.example.entities.CategoryEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CategoryMapper {
    @Mapping(source = "creationTime", target = "dateCreated", dateFormat = "dd.MM.yyyy HH:MM:ss")
    CategoryDTO categoryItemDTO(CategoryEntity category);
    List<CategoryDTO> categoriesListItemDTO(List<CategoryEntity> list);

    @Mapping(target = "image", ignore = true)
    CategoryEntity categoryEntityByCategoryCreateDTO(CategoryCreateDTO category);
}
