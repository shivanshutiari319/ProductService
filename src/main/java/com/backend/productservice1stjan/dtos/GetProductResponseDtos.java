package com.backend.productservice1stjan.dtos;

import com.backend.productservice1stjan.model.Product;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GetProductResponseDtos {

    long id;
    String description;
    String title;
    String category;
    String image;

    public static GetProductResponseDtos fromProduct(Product product){
        GetProductResponseDtos dto =new GetProductResponseDtos();
        dto.setId(product.getId());
        dto.setTitle(product.getTitle());
       // dto.setCategory(product.getProductCategory());
        dto.setDescription(product.getProductDescription());
        dto.setImage(product.getProductImage());
        return dto;


    }





}
