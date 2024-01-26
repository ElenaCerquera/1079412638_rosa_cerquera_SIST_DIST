package Corhuila.demo.IRepository;

import Corhuila.demo.Entity.CustomerProduct1079412638;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICustomerProductRepository extends JpaRepository<CustomerProduct1079412638,Long> {
}
