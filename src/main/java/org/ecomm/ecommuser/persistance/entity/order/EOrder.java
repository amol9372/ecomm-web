package org.ecomm.ecommuser.persistance.entity.order;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import org.ecomm.ecommuser.persistance.entity.BaseEntity;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@SuperBuilder(toBuilder = true)
@Table(name = "orders")
public class EOrder extends BaseEntity {

  @Column(name = "order_no")
  String orderNo;

  @Column(name = "user_id")
  Integer userId;

  @Column(name = "order_placed_on")
  LocalDateTime orderPlacedOn;

  @Enumerated(EnumType.STRING)
  OrderStatus orderStatus;

  @Column(name = "total_price")
  double totalPrice;

  String currency;

  @Column(name = "delivered_on")
  LocalDateTime deliveredOn;

  @Column(name = "address_id")
  Integer addressId;

  /*
  Not Implemented as of now
   */
  @Column(name = "payment_method")
  String paymentMethod;

  @Enumerated(EnumType.STRING)
  DeliveryStatus deliveryStatus;
}
