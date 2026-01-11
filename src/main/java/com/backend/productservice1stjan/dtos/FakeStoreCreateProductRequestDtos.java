package com.backend.productservice1stjan.dtos;

import com.backend.productservice1stjan.model.Product;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FakeStoreCreateProductRequestDtos {
    long id;
    String title;
    String description;
    long price;
    String category;
    String image;


    public static FakeStoreCreateProductRequestDtos fromProduct(Product product) {
        FakeStoreCreateProductRequestDtos  fakeStoreCreateProductRequestDtos = new FakeStoreCreateProductRequestDtos();
        fakeStoreCreateProductRequestDtos.setId(product.getId());
        fakeStoreCreateProductRequestDtos.setTitle(product.getTitle());
        fakeStoreCreateProductRequestDtos.setDescription(product.getProductDescription());
        fakeStoreCreateProductRequestDtos.setPrice(product.getProductPrice());
        //fakeStoreCreateProductRequestDtos.setCategory(product.getProductCategory());
        fakeStoreCreateProductRequestDtos.setImage(product.getProductImage());
        return fakeStoreCreateProductRequestDtos;
    }

}
