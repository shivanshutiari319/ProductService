package com.backend.productservice1stjan.dtos;

import com.backend.productservice1stjan.model.Product;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateProductRequestDtos {
    long id;
    String title;
    String description;
    long price;
    String image;
    String category;


    public Product toProduct(){
        Product product = new Product();
       // product.setProductCategory(category);
        product.setId(id);
        product.setTitle(title);
        product.setProductImage(image);
        product.setProductDescription(description);
        product.setProductPrice(price);
        return product;
    }
}
