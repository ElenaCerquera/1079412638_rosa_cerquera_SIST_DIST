package Corhuila.demo.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "CustomerProduct_1079412638")
public class CustomerProduct1079412638 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long customer_id;
    private Long product_id;

}
