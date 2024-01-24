package org.ecomm.ecommuser.persistance.entity.cart;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import org.ecomm.ecommuser.persistance.entity.BaseEntity;

@Entity
@Getter
@Setter
@SuperBuilder(toBuilder = true)
@Table(name = "cart_item")
@NoArgsConstructor
public class ECartItem extends BaseEntity {

  @ManyToOne
  @JoinColumn(name = "cart_id")
  ECart cart;

  @Column(name = "variant_id")
  Integer variantId;

  @Column(name = "product_id")
  Integer productId;

  int quantity;
}
