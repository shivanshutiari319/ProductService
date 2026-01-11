package com.backend.productservice1stjan.dtos;

import com.backend.productservice1stjan.model.Product;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FakeStoreGetProductResponseDtos {
    long id;
    String title;
    String description;
    long price;
    String category;
    String image;

    public static Product toproduct(FakeStoreGetProductResponseDtos product) {
        Product product1 = new Product();
        product1.setId(product.getId());
        product1.setProductDescription(product.getDescription());
        product1.setProductPrice(product.getPrice());
       // product1.setProductCategory(product.getCategory());
        product1.setProductImage(product.getImage());
        return product1;
    }
}
