package com.backend.productservice1stjan.dtos;

import com.backend.productservice1stjan.model.Product;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateProductResponseDtos {

    private Long id;
    private String productName;
    private String productDescription;
    private long productPrice;
    private String productCategory;


    public static CreateProductResponseDtos fromProduct(Product product){
        CreateProductResponseDtos ResponseDtos = new CreateProductResponseDtos();
        ResponseDtos.setId(product.getId());
        ResponseDtos.setProductName(product.getProductName());
        ResponseDtos.setProductDescription(product.getProductDescription());
       // ResponseDtos.setProductCategory(product.getProductCategory());
        ResponseDtos.setProductPrice(product.getProductPrice());
        return ResponseDtos;
    }

}
