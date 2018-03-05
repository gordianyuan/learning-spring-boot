package springboot.multipledatabases;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import springboot.multipledatabases.product.domain.Product;
import springboot.multipledatabases.product.repo.ProductRepo;
import springboot.multipledatabases.user.domain.User;
import springboot.multipledatabases.user.repo.UserRepo;

@Controller
public class PurchaseController {

  private final UserRepo userRepo;
  private final ProductRepo productRepo;

  @Autowired
  public PurchaseController(UserRepo userRepo, ProductRepo productRepo) {
    this.userRepo = userRepo;
    this.productRepo = productRepo;
  }

  @ResponseBody
  @GetMapping("/purchase")
  public String purchase() {
    User user = userRepo.findByName("hello");
    Product product = productRepo.findByName("phone");
    return user.getName() + " buy " + product.getName();
  }

}
