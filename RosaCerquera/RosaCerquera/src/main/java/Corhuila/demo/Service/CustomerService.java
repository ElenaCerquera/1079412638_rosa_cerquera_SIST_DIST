package Corhuila.demo.Service;

import Corhuila.demo.Entity.Customer1079412638;
import Corhuila.demo.IRepository.ICustomerRepository;
import Corhuila.demo.IService.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService implements ICustomerService {
    @Autowired
    private ICustomerRepository iCustomerRepository;

    @Override
    public List<Customer1079412638> finAll() {
        return iCustomerRepository.findAll();
    }

    @Override
    public Optional<Customer1079412638> finById(Long id) {
        Optional<Customer1079412638> customer1079412638 = iCustomerRepository.findById(id);
        if (customer1079412638.isPresent()){
            return customer1079412638;
        }
        return null;
    }

    @Override
    public Customer1079412638 save(Customer1079412638 customer1079412638) {
        return iCustomerRepository.save(customer1079412638);
    }

    @Override
    public void update(Customer1079412638 customer1079412638, Long id) {

    }

    @Override
    public void delete(Long id) {
        iCustomerRepository.deleteById(id);
    }
}
