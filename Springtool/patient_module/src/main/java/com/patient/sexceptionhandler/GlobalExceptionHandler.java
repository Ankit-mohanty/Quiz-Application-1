package com.patient.sexceptionhandler;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {
 @ExceptionHandler(ResourceNotFoundException.class)
 public ResponseEntity<ErrorDetails>resourceNotFoundException(ResourceNotFoundException ex,WebRequest wr){
	 ErrorDetails error=new ErrorDetails(new Date(),ex.getMessage(),wr.getDescription(false));
	 return new  ResponseEntity<>(error,HttpStatus.NOT_FOUND);
 }
}
