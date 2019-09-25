package com.tomtom.ordersystem.product.controller;

import com.tomtom.ordersystem.product.model.Product;
import com.tomtom.ordersystem.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping("/product")
    public List<Product> product(@RequestParam(value = "productid",defaultValue = "all") final String productid) {
        return productService.getAllProducts();
    }

    @RequestMapping(value = "/product",method = RequestMethod.POST)
    public void addProduct(@RequestBody final Product product) {
        productService.addProduct(product);
    }

    @RequestMapping(value = "/product",method = RequestMethod.DELETE)
    public void removeProduct(@RequestBody final Product product) {
        productService.removeProduct(product);
    }
}
