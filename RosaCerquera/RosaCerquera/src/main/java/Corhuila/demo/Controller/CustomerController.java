package Corhuila.demo.Controller;

import Corhuila.demo.Entity.Customer1079412638;
import Corhuila.demo.IService.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/customer")
public class CustomerController {

    @Autowired
    private ICustomerService customerService;

    @GetMapping()
    public List<Customer1079412638> consultarTodo() {
        return customerService.finAll();
    }

    @GetMapping("{id}")
    public Optional<Customer1079412638> finById(@PathVariable Long id) {
        return customerService.finById(id);
    }

    @PostMapping
    public Customer1079412638 save(@RequestBody Customer1079412638 customer1079412638) {
        return customerService.save(customer1079412638);
    }

    @PutMapping("{id}")
    public void update(@RequestBody Customer1079412638 customer1079412638, @PathVariable Long id) {
        customerService.update(customer1079412638,id);
    }

    @DeleteMapping("{id}")
    public void eliminar(@PathVariable Long id) {
        customerService.delete(id);
    }
}
