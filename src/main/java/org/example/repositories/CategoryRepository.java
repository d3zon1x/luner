package org.example.repositories;

import org.example.entities.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

@Repository
public interface CategoryRepository extends JpaRepository<CategoryEntity, Integer> {
    Page<CategoryEntity> findByNameContainingIgnoreCase(String name, Pageable pageable);
}
