package com.backend.productservice1stjan.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@Entity
public class Category extends BaseModel {

    String name;
    String description;
    @OneToMany
    List<Product>featureProducts;
    @OneToMany(mappedBy = "category")
    List<Product>allProducts;
}
