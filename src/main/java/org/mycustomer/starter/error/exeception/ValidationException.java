package org.mycustomer.starter.error.exeception;

import org.springframework.http.HttpStatus;

import java.util.UUID;

public class ValidationException extends BaseException{
    public ValidationException(UUID transactionId, String message) {
        super(transactionId, HttpStatus.BAD_REQUEST, message);
    }
}
