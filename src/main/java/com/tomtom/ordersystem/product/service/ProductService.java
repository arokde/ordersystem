package com.tomtom.ordersystem.product.service;

import com.tomtom.ordersystem.product.model.Product;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ProductService {


    private Map<String,Product> products = new HashMap<>();

    public List<Product> getAllProducts(){

        return (List<Product>) new ArrayList(products.values());
    }

    public boolean addProduct(final Product newProduct) {

        // will have some logic for validation of business rules
        return null != products.putIfAbsent(newProduct.getName(),newProduct);
    }

    public boolean removeProduct(final Product productTobeDeleted ) {

        return null != products.remove(productTobeDeleted.getName());
    }


}
