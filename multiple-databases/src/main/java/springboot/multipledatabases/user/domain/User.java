package springboot.multipledatabases.user.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "users")
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column
  private String name;

  @Column(unique = true, nullable = false)
  private String email;

  @Column
  private int age;

}
