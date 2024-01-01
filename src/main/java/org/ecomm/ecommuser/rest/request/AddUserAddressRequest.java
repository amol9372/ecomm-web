package org.ecomm.ecommuser.rest.request;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Setter
@Getter
@SuperBuilder(toBuilder = true)
@NoArgsConstructor
public class AddUserAddressRequest {

  Integer userId;
  boolean defaultAddress;
  String name;
  String streetAddress;
  String city;
  String state;
  String postalCode;
  String country;
}
