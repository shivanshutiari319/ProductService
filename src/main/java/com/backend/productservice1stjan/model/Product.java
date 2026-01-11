package com.backend.productservice1stjan.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Product extends BaseModel{
    private long id;
    private String productName;
    private String title;
    private String productDescription;
    private long productPrice;
    @ManyToOne
    private Category category;
    private String productImage;

}
