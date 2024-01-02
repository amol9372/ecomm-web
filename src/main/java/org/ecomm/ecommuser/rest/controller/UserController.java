package org.ecomm.ecommuser.rest.controller;

import java.net.URI;
import java.util.Iterator;
import java.util.Map;
import java.util.stream.Stream;

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


//    Stream.of(httpServletRequest.getHeaderNames()).forEach(header -> {
//       log.info("header is ::: {}", header.nextElement());
//    });

    Iterator<String> iterator = httpServletRequest.getHeaderNames().asIterator();

    while (iterator.hasNext()) {
      log.info("header is {}", iterator.next());
      log.info("header value is {}",httpServletRequest.getHeader(iterator.next()));
    }

    log.info("name header is {}", httpServletRequest.getHeaders("name"));

    log.info("Request is ::: {}", httpServletRequest.getHeaderNames());

    return ResponseEntity.created(URI.create("/user")).body(Map.of("id", user.getId()));
  }
}
