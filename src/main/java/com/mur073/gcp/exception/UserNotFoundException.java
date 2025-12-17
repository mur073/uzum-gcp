package com.mur073.gcp.exception;


import com.mur073.gcp.constant.enums.ErrorType;
import org.springframework.http.HttpStatus;

import static com.mur073.gcp.constant.enums.Error.INVALID_REQUEST_PARAM_ERROR_CODE;

public class UserNotFoundException extends GcpException {
    public UserNotFoundException(String userId) {
        super(
            INVALID_REQUEST_PARAM_ERROR_CODE.getCode(),
            String.format("User with id=%s not found", userId),
            ErrorType.VALIDATION, HttpStatus.NOT_FOUND
        );
    }
}
