package springboot.multipledatabases.product.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "purchases")
public class Purchase {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(nullable = false)
  private String username;

  @ManyToOne
  @JoinColumn(nullable = false)
  private Product product;

}
