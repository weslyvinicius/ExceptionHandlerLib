package org.mycustomer.starter.error.exeception;

import lombok.Data;
import org.springframework.http.HttpStatus;

import java.util.UUID;

@Data
public abstract class BaseException extends RuntimeException{

    private UUID transactionId;
    private HttpStatus httpStatusCode;

    protected BaseException(UUID transactionId, HttpStatus httpStatusCode, String message) {
        super(message);
        this.transactionId = transactionId;
        this.httpStatusCode = httpStatusCode;
    }


}
