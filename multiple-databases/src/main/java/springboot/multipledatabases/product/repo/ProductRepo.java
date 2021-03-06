package springboot.multipledatabases.product.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import springboot.multipledatabases.product.domain.Product;

@RepositoryRestResource
public interface ProductRepo extends JpaRepository<Product, Long> {

  Product findByName(String name);

}
