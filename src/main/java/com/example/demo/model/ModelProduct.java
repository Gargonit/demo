package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Entity
@Table (name = "New_product")
@Data
public class ModelProduct {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    Long id;

    @Column (name = "product_name")
    String product_name;

    @Column (name = "product_width")
    String product_width;

    @Column (name = "product_height")
    String product_height;

}
