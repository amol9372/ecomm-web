package org.ecomm.ecommweb.persistance.entity.user;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.ecomm.ecommweb.persistance.entity.BaseEntity;

@Entity
@Getter
@Setter
@NoArgsConstructor
@SuperBuilder(toBuilder = true)
@Table(name = "address")
public class EAddress extends BaseEntity {

  String name;

  @Column(name = "street_address")
  String streetAddress;

  String city;

  String state;

  @Column(name = "postal_code")
  String postalCode;

  String country;
}
