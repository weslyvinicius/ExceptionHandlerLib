package org.mycustomer.starter.error.exeception;

import org.springframework.http.HttpStatus;

import java.util.UUID;

public class FordiddenException extends BaseException{
    public FordiddenException(UUID transactionId, String message) {
        super(transactionId, HttpStatus.FORBIDDEN, message);
    }
}
