package com.example.demo.jdbc;


import lombok.Data;
import lombok.Getter;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Table(name = "product")
public class Product {
    private Integer stock;
}
