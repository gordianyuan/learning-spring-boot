package springboot.multipledatabases.user.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.hateoas.Resources;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import springboot.multipledatabases.product.domain.Purchase;
import springboot.multipledatabases.product.repo.PurchaseRepo;

import java.util.List;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

@RepositoryRestController
public class UserRepoController {

  private final PurchaseRepo purchaseRepo;

  @Autowired
  public UserRepoController(PurchaseRepo purchaseRepo) {
    this.purchaseRepo = purchaseRepo;
  }

  @ResponseBody
  @GetMapping("/users/{username}/purchases")
  public ResponseEntity<?> listPurchases(@PathVariable String username) {
    List<Purchase> producers = purchaseRepo.findByUsername(username);

    Resources<Purchase> resources = new Resources<>(producers);
    resources.add(linkTo(methodOn(UserRepoController.class).listPurchases(username)).withSelfRel());

    return ResponseEntity.ok(resources);
  }

}
