package springboot.multipledatabases.user.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import springboot.multipledatabases.user.domain.User;

@RepositoryRestResource
public interface UserRepo extends JpaRepository<User, Long> {

  User findByName(String name);

}
