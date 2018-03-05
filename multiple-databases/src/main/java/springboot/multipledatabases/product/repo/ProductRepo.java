package springboot.multipledatabases.product.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import springboot.multipledatabases.product.domain.Product;

public interface ProductRepo extends JpaRepository<Product, Long> {

  Product findByName(String phone);

}
