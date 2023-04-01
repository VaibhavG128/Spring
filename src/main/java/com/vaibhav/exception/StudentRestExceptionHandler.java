package com.vaibhav.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class StudentRestExceptionHandler {

	@ExceptionHandler
	public ResponseEntity<CustomExceptionHandler> handlerException(Exception exc)
	{

			CustomExceptionHandler cus = new CustomExceptionHandler();
			cus.setStatus(HttpStatus.BAD_REQUEST.value());
			cus.setMessage(exc.getMessage());
			cus.setTimeStamp(System.currentTimeMillis());
			return new ResponseEntity<>(cus,HttpStatus.BAD_REQUEST);

	}
}
