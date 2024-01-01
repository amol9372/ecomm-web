package org.ecomm.ecommuser.rest.builder;

import org.ecomm.ecommuser.persistance.entity.user.EUser;
import org.ecomm.ecommuser.persistance.entity.user.UserStatus;
import org.ecomm.ecommuser.rest.request.AddUserRequest;

import java.time.LocalDateTime;

public class UserBuilder {

  public static EUser with(AddUserRequest request) {
    return EUser.builder()
        .firstName(request.getFirstName())
        .lastName(request.getLastName())
        .email(request.getEmail())
        .mobile(request.getMobile())
        .provider(request.getProvider())
        .status(UserStatus.ACTIVE_NOT_VERIFIED)
        .createdAt(LocalDateTime.now())
        .build();
  }
}
