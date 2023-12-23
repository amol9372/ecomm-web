package org.ecomm.ecommweb.persistance.entity.cart;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import org.ecomm.ecommweb.persistance.entity.BaseEntity;

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

  @Column(name = "product_id")
  Integer productId;

  int quantity;
}
