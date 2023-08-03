package com.example.demo.controller;

import com.example.demo.model.ModelProduct;
import com.example.demo.repos.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/addProduct")
public class addProductController {
    final
    ProductRepository productRepository;

    public addProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @PostMapping
    public String postData(@RequestParam String product_name, @RequestParam String product_width,
                           @RequestParam String product_height){
        ModelProduct modelProduct = new ModelProduct();
        modelProduct.setProduct_name(product_name);
        modelProduct.setProduct_width(product_width);
        modelProduct.setProduct_height(product_height);
        productRepository.save(modelProduct);
        return"index";
}
    @GetMapping
    public String addProduct(){
        return "addProduct";
}

}
