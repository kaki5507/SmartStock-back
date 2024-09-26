package com.smartstock.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "products")
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;        // 상품 id

    private String name;    // 상품 이름
    private double price;   // 상품 가격
    private int quantity;   // 재고 수량
}
