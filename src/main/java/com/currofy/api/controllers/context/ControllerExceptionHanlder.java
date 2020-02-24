package com.currofy.api.controllers.context;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.currofy.api.controllers.exception.ControllerException;
import com.currofy.api.core.dto.ErrorDTO;


@ControllerAdvice
public class ControllerExceptionHanlder {

	@ExceptionHandler({ ControllerException.class })
	public ResponseEntity<ErrorDTO> exception(ControllerException exception) {
		int value = exception.getExceptionType().getValue();
		ErrorDTO error = new ErrorDTO(value, exception.getMessage());
		return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
	}
	
}

