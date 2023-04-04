package org.mycustomer.starter.error.exeception;

import org.springframework.http.HttpStatus;

import java.util.UUID;

public class NoContentException extends BaseException{
    public NoContentException(UUID transactionId, String message) {
        super(transactionId, HttpStatus.NO_CONTENT, message);
    }
}
