package org.ecomm.ecommuser.rest.request;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Setter
@Getter
@SuperBuilder(toBuilder = true)
@NoArgsConstructor
public class AddUserRequest {

    String firstName;
    String lastName;
    String email;
    String mobile;
    String provider;
    String status;

}
