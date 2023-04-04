package org.mycustomer.starter.error.exeception;

import org.springframework.http.HttpStatus;

import java.util.UUID;

public class InternalServerException extends BaseException{
    public InternalServerException(UUID transactionId, String message) {
        super(transactionId, HttpStatus.INTERNAL_SERVER_ERROR, message);
    }
}
