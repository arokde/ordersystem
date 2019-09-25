package com.tomtom.ordersystem.product;

import com.tomtom.ordersystem.product.model.Product;
import com.tomtom.ordersystem.product.service.ProductService;
import org.junit.Test;

public class ProductServiceTest {


    @Test
    public void testAddProducts() {

        final ProductService service = new ProductService();

        final Product productToAdd = new Product("OnePlus","mobile","3","3.4");

        service.addProduct(productToAdd);

        assert productToAdd == service.getAllProducts().get(0);

    }


}
