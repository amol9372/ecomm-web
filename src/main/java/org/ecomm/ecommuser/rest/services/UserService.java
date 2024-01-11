package org.ecomm.ecommuser.rest.services;

import org.ecomm.ecommuser.rest.model.User;
import org.ecomm.ecommuser.rest.request.AddUserRequest;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    User createAppUser(AddUserRequest request);

    User getBasicUserInfo();

    User getBasicUserInfo(String email);
}
