package org.mycustomer.starter.error.handler;

import org.mycustomer.starter.error.exeception.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class RestExceptionHandler {

    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    public ProblemDetail methodArgumentNotValidException(MethodArgumentNotValidException methodArgumentNotValidException) {
        ProblemDetail problemDetail = ProblemDetail.forStatus(HttpStatus.BAD_REQUEST);
        problemDetail.setTitle(methodArgumentNotValidException.getClass().getName());
                //.addCamposObrigarios(messageSourceUtil.getMessageCamposObrigarios(methodArgumentNotValidException.getBindingResult().getFieldErrors()));
        return problemDetail;

    }

    @ExceptionHandler(value = HttpRequestMethodNotSupportedException.class)
    public ProblemDetail httpRequestMethodNotSupportedException(HttpRequestMethodNotSupportedException exception) {
        ProblemDetail problemDetail = ProblemDetail.forStatus(HttpStatus.METHOD_NOT_ALLOWED);
        problemDetail.setTitle(exception.getClass().getName());
                //.addMenssagemErro(exception.getMessage());
        return problemDetail;

    }

    @ExceptionHandler(value = BaseException.class)
    public ProblemDetail methodBaseException(BaseException baseException) {
        ProblemDetail problemDetail = ProblemDetail.forStatus(baseException.getHttpStatusCode());
        problemDetail.setTitle(baseException.getClass().getName());
        problemDetail.setDetail(baseException.getMessage());
        return problemDetail;
    }

    @ExceptionHandler(value = FordiddenException.class)
    public ProblemDetail methodFordiddenException(FordiddenException exception) {
        ProblemDetail problemDetail = ProblemDetail.forStatus(exception.getHttpStatusCode());
        problemDetail.setTitle(exception.getClass().getName());
        problemDetail.setDetail(exception.getMessage());
        return problemDetail;
    }

    @ExceptionHandler(value = InternalServerException.class)
    public ProblemDetail methodInternalServerException(InternalServerException exception) {
        ProblemDetail problemDetail = ProblemDetail.forStatus(exception.getHttpStatusCode());
        problemDetail.setTitle(exception.getClass().getName());
        problemDetail.setDetail(exception.getMessage());
        return problemDetail;
    }

    @ExceptionHandler(value = NoContentException.class)
    public ProblemDetail methodNoContentException(NoContentException exception) {
        ProblemDetail problemDetail = ProblemDetail.forStatus(exception.getHttpStatusCode());
        problemDetail.setTitle(exception.getClass().getName());
        problemDetail.setDetail(exception.getMessage());
        return problemDetail;
    }

    @ExceptionHandler(value = NotFoundException.class)
    public ProblemDetail methodNotFoundException(NotFoundException exception) {
        ProblemDetail problemDetail = ProblemDetail.forStatus(exception.getHttpStatusCode());
        problemDetail.setTitle(exception.getClass().getName());
        problemDetail.setDetail(exception.getMessage());
        return problemDetail;
    }

    @ExceptionHandler(value = ValidationException.class)
    public ProblemDetail methodValidationException(ValidationException exception) {
        ProblemDetail problemDetail = ProblemDetail.forStatus(exception.getHttpStatusCode());
        problemDetail.setTitle(exception.getClass().getName());
        problemDetail.setDetail(exception.getMessage());
        return problemDetail;
    }
}
