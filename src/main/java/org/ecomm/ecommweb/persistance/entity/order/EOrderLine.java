package org.ecomm.ecommweb.persistance.entity.order;

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
@NoArgsConstructor
@Table(name = "order_line")
public class EOrderLine extends BaseEntity {

  @ManyToOne
  @JoinColumn(name = "order_id")
  EOrder order;

  @Column(name = "product_id")
  Integer productId;

  int quantity;
}
