package org.ecomm.ecommuser.rest.services;

import org.ecomm.ecommuser.persistance.entity.user.EUser;
import org.ecomm.ecommuser.persistance.repository.UserRepository;
import org.ecomm.ecommuser.rest.builder.UserBuilder;
import org.ecomm.ecommuser.rest.model.User;
import org.ecomm.ecommuser.rest.request.AddUserRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

  @Autowired UserRepository userRepository;

  @Override
  public User createAppUser(AddUserRequest request) {

    EUser eUser = UserBuilder.with(request);
    EUser savedUser = userRepository.save(eUser);

    return User.builder().id(savedUser.getId()).build();
  }

  @Override
  public User getBasicUserInfo(){

  }
}
