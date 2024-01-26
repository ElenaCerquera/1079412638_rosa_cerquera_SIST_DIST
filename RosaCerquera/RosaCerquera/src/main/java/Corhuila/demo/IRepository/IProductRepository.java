package Corhuila.demo.IRepository;

import Corhuila.demo.Entity.Product1079412638;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductRepository extends JpaRepository<Product1079412638,Long> {
}
