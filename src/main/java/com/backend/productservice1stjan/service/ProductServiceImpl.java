package com.backend.productservice1stjan.service;

import com.backend.productservice1stjan.dtos.*;
import com.backend.productservice1stjan.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

@Service("productService")
public class ProductServiceImpl implements ProductService {


    @Override
    public Product createProduct(Product product) {
        return null;
    }

    @Override
    public List<Product> getAllProduct() {
        return List.of();
    }

    @Override
    public Product partialUpdateProduct(Long ProductId, Product product) {
        return null;
    }
}
