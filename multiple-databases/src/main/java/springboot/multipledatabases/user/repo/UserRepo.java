package springboot.multipledatabases.user.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import springboot.multipledatabases.user.domain.User;

public interface UserRepo extends JpaRepository<User, Long> {

  User findByName(String name);
}
