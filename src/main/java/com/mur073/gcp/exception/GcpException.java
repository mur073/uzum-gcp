package com.mur073.gcp.exception;

import com.mur073.gcp.constant.enums.ErrorType;
import lombok.Getter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;
import org.springframework.http.HttpStatus;

@Getter
@ToString
@FieldDefaults(level = lombok.AccessLevel.PRIVATE, makeFinal = true)
public class GcpException extends RuntimeException {

    int code;
    String message;
    HttpStatus status;
    ErrorType errorType;

    public GcpException(int code, String message, ErrorType errorType, HttpStatus status) {
        super(message);
        this.code = code;
        this.status = status;
        this.message = message;
        this.errorType = errorType;
    }
}
