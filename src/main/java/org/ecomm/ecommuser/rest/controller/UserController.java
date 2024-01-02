package org.ecomm.ecommuser.rest.controller;

import java.net.URI;
import java.util.Map;

import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.ecomm.ecommuser.rest.request.AddUserRequest;
import org.ecomm.ecommuser.rest.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("user")
@Slf4j
public class UserController {

  @Autowired UserService userService;

  @PostMapping
  public ResponseEntity<Object> createAppUser(@RequestBody AddUserRequest request, HttpServletRequest httpServletRequest) {
    var user = userService.createAppUser(request);

    log.info("Request is ::: {}", httpServletRequest.toString());

    return ResponseEntity.created(URI.create("/user")).body(Map.of("id", user.getId()));
  }
}
