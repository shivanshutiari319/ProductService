package com.backend.productservice1stjan.controller;

import com.backend.productservice1stjan.dtos.CreateProductRequestDtos;
import com.backend.productservice1stjan.dtos.CreateProductResponseDtos;
import com.backend.productservice1stjan.dtos.GetProductResponseDtos;
import com.backend.productservice1stjan.dtos.PatchProductResponseDtos;
import com.backend.productservice1stjan.model.Product;
import com.backend.productservice1stjan.service.ProductService;
import com.backend.productservice1stjan.service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;


    public ProductController(@Qualifier("productService") ProductServiceImpl productService) {
        this.productService = productService;

    }


    @PostMapping("")
    public CreateProductResponseDtos createProductResponseDto(@RequestBody CreateProductRequestDtos createProductRequestDtos){
        System.out.println("createProductResponseDto-->"+ createProductRequestDtos.toProduct());
        Product product = new Product();
        product = productService.createProduct(createProductRequestDtos.toProduct());

        return CreateProductResponseDtos.fromProduct(product);
    }

    @GetMapping("/{id}")
    public GetProductResponseDtos getProductResponseDtos(@PathVariable long id){
        return null;
    }

    @GetMapping("")
    public List<GetProductResponseDtos> getProductResponseDtos(){
        List<Product> getProductResponseDtos = productService.getAllProduct();
        List<GetProductResponseDtos> ResponseList = new ArrayList<>();
        for(Product product: getProductResponseDtos){
            GetProductResponseDtos productResponseDtos = GetProductResponseDtos.fromProduct(product);
            ResponseList.add(productResponseDtos);
        }
        return ResponseList;
    }
    @PatchMapping("/{id}")
    public PatchProductResponseDtos updateProcduct(@PathVariable("id") Long ProductId, @RequestBody Product  Product
    ){
        Product product = new Product();
        product = productService.partialUpdateProduct(ProductId,product);

        PatchProductResponseDtos patchProductResponseDtos = PatchProductResponseDtos.fromProduct(product);

        return null;
    }

    @ExceptionHandler
    public void handleException(RuntimeException ex){
        System.out.println("handleException-->"+ex.getMessage());
    }



}
