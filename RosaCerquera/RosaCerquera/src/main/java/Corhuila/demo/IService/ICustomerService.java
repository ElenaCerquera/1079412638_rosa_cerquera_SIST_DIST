package Corhuila.demo.IService;

import Corhuila.demo.Entity.Customer1079412638;

import java.util.List;
import java.util.Optional;

public interface ICustomerService {
    List<Customer1079412638> finAll();
    public Optional<Customer1079412638> finById(Long id);

    public Customer1079412638 save (Customer1079412638 customer1079412638);
    public void update (Customer1079412638 customer1079412638, Long id);
    public void delete (Long id);




}
