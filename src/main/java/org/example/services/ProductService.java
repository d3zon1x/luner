package org.example.services;

import org.example.dto.ProductCreateDTO;
import org.example.dto.ProductItemDTO;

import java.util.List;

public interface ProductService {
    ProductItemDTO create(ProductCreateDTO model);
    List<ProductItemDTO> get();
}