package Corhuila.demo.Controller;

import Corhuila.demo.Entity.Product1079412638;
import Corhuila.demo.IService.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/product")
public class ProductController {

    @Autowired
    private IProductService iProductService;

    @GetMapping()
    public List<Product1079412638> consultarTodo() {
        return iProductService.finAll();
    }

    @GetMapping("{id}")
    public Optional<Product1079412638> finById(@PathVariable Long id) {
        return iProductService.finById(id);
    }

    @PostMapping
    public Product1079412638 save(@RequestBody Product1079412638 product1079412638) {
        return iProductService.save(product1079412638);
    }

    @PutMapping("{id}")
    public void update(@RequestBody Product1079412638 product1079412638, @PathVariable Long id) {
        iProductService.update(product1079412638,id);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id) {
        iProductService.delete(id);
    }
}
