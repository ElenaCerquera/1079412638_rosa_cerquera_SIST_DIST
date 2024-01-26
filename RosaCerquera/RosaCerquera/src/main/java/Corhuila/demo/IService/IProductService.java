package Corhuila.demo.IService;

import Corhuila.demo.Entity.Customer1079412638;
import Corhuila.demo.Entity.Product1079412638;

import java.util.List;
import java.util.Optional;

public interface IProductService {
    List<Product1079412638> finAll();
    public Optional<Product1079412638> finById(Long id);

    public Product1079412638 save (Product1079412638 product1079412638);
    public void update (Product1079412638 product1079412638, Long id);
    public void delete (Long id);

}
