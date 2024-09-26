package com.smartstock.service;

import com.smartstock.model.Product;
import com.smartstock.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProducts() {
        return productRepository.findAll(); // 모든 상품 조회
    }

    public Product createProduct(Product product) {
        return productRepository.save(product); // 상품 생성
    }

    public Product getProductById(Long id) {
        return productRepository.findById(id).orElse(null); // 특정 상품 조회
    }

    public Product updateProduct(Long id, Product product) {
        product.setId(id); // ID 설정
        return productRepository.save(product); // 상품 업데이트
    }

    public void deleteProduct(Long id) {
        productRepository.deleteById(id); // 상품 삭제
    }
}
