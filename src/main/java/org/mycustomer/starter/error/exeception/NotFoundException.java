package org.mycustomer.starter.error.exeception;

import org.springframework.http.HttpStatus;

import java.util.UUID;

public class NotFoundException extends BaseException{
    public NotFoundException(UUID transactionId, String message) {
        super(transactionId, HttpStatus.NOT_FOUND, message);
    }
}
