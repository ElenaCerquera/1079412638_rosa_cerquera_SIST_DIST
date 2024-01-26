package Corhuila.demo.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Product_1079412638")
public class Product1079412638 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
}
