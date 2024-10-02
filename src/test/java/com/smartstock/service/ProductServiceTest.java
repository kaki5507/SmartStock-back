package com.smartstock.service;

import com.smartstock.model.Product;
import com.smartstock.SmartStockBackendApplication;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

@SpringBootTest(classes = SmartStockBackendApplication.class)
public class ProductServiceTest {

    @Autowired
    private ProductService productService;

    @Test
    public void testCreateProduct() {
        Product product = new Product();
        product.setName("Test Product");
        product.setPrice(19.99);
        product.setQuantity(10);

        Product createdProduct = productService.createProduct(product);

        assertNotNull(createdProduct);
        assertEquals("Test Product", createdProduct.getName());
    }

    @Test
    public void testGetAllProducts() {
        List<Product> products = productService.getAllProducts();
        assertNotNull(products);
    }
}
