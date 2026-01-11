package com.backend.productservice1stjan.service;

import com.backend.productservice1stjan.dtos.CreateProductRequestDtos;
import com.backend.productservice1stjan.dtos.GetProductResponseDtos;
import com.backend.productservice1stjan.model.Product;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ProductService {
    Product createProduct(Product product);
    List<Product> getAllProduct();
    Product partialUpdateProduct(Long ProductId, Product product);

}
