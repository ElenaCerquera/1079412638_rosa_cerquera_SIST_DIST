package Corhuila.demo.IRepository;

import Corhuila.demo.Entity.Customer1079412638;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICustomerRepository extends JpaRepository<Customer1079412638, Long> {
}
