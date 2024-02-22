package com.msvc.usuario.exception.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.msvc.usuario.exception.ResourceNotFoundException;
import com.msvc.usuario.response.ApiResponse;

@RestControllerAdvice
public class GlobalExceptionController {
	
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<ApiResponse> handlerResourceNotFoundException(ResourceNotFoundException resourceNotFoundException){
		
		 String mensaje = resourceNotFoundException.getMessage();
		 
		/* ApiResponse response = new ApiResponse().builder()
				 .message(mensaje)
				 .status(HttpStatus.NOT_FOUND)
				 .build();
				 
		 return new ResponseEntity<>(response,HttpStatus.NOT_FOUND);*/
		 return null;
	}
}
