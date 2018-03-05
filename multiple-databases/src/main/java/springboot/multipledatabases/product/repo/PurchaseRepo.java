package springboot.multipledatabases.product.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import springboot.multipledatabases.product.domain.Purchase;

import java.util.List;

@RepositoryRestResource
public interface PurchaseRepo extends JpaRepository<Purchase, Long> {

  List<Purchase> findByUsername(String name);

}
