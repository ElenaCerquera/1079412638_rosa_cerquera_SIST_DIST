package Corhuila.demo.Service;

import Corhuila.demo.Entity.Product1079412638;
import Corhuila.demo.IService.IProductService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService implements IProductService {
    @Override
    public List<Product1079412638> finAll() {
        return null;
    }

    @Override
    public Optional<Product1079412638> finById(Long id) {
        return Optional.empty();
    }

    @Override
    public Product1079412638 save(Product1079412638 product1079412638) {
        return null;
    }

    @Override
    public void update(Product1079412638 product1079412638, Long id) {

    }

    @Override
    public void delete(Long id) {

    }
}
