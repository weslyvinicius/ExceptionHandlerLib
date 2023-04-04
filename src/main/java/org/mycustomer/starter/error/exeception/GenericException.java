package org.mycustomer.starter.error.exeception;

import org.springframework.http.HttpStatus;

import java.util.UUID;

public class GenericException extends BaseException{
    public GenericException(UUID transactionId, String message) {
        super(transactionId, HttpStatus.BAD_REQUEST, message);
    }
}
