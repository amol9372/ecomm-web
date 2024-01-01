package org.ecomm.ecommuser.persistance.entity.cart;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import org.ecomm.ecommuser.persistance.entity.BaseEntity;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@SuperBuilder(toBuilder = true)
@Table(name = "cart")
public class ECart extends BaseEntity {

  @Column(name = "user_id")
  Integer userId;

  @Enumerated(EnumType.STRING)
  CartStatus status;

  @Column(name = "total_price")
  Double totalPrice;

  Double discount;

  @OneToMany(mappedBy = "cart")
  List<ECartItem> cartItems;
}
