package org.ecomm.ecommuser.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
@Slf4j
public class EcommExceptionHandler {

  /*
  Handle Internal Server error exceptions
   */
  @org.springframework.web.bind.annotation.ExceptionHandler(Exception.class)
  protected ResponseEntity<ErrorResponse> handleBaseException(BaseException ex) {

    var errorResponse =
        ErrorResponse.builder()
            .code(ex.getErrorResponse().getCode())
            .message(ex.getErrorResponse().getMessage())
            .build();

    //    var apiResponse =
    //        ApiResponse.errorResponse(List.of(errorResponse), "An exception occurred in the API");

    //    log.error("[{}] Error while processing requests ::: ", MDC.get("requestId"), ex);
    return new ResponseEntity<>(errorResponse, ex.getStatus());
  }

  //  @org.springframework.web.bind.annotation.ExceptionHandler(Exception.class)
  //  protected ResponseEntity<ApiResponse<?>> handleException(BaseException ex) {
  //
  //    var errorResponse =
  //            ErrorResponse.builder()
  //                    .code(ex.getErrorResponse().getCode())
  //                    .message(ex.getErrorResponse().getMessage())
  //                    .build();
  //
  //    var apiResponse =
  //            ApiResponse.errorResponse(List.of(errorResponse), "An exception occurred in the
  // API");
  //
  //    log.error("[{}] Error while processing requests ::: ", MDC.get("requestId"), ex);
  //    return new ResponseEntity<>(apiResponse, ex.getStatus());
  //  }
}
