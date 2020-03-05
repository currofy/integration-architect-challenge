package com.currofy.api.controllers.context;

import java.io.PrintWriter;
import java.io.StringWriter;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.NoHandlerFoundException;

import com.currofy.api.core.dto.ErrorDTO;

@ControllerAdvice
public class GeneralExceptionHanlder {


		
	@ExceptionHandler({ Exception.class })
	public ResponseEntity<ErrorDTO> exception(HttpServletRequest request, Exception exception) {
		StringWriter sw = new StringWriter();
		PrintWriter pw = new PrintWriter(sw);
		exception.printStackTrace(pw);
		HttpStatus status = HttpStatus.INTERNAL_SERVER_ERROR;
		ErrorDTO error = new ErrorDTO(status.value(), status.getReasonPhrase());
		return new ResponseEntity<>(error, status);
	}
	
	@ExceptionHandler(NoHandlerFoundException.class)        
    public ResponseEntity<ErrorDTO> requestHandlingNoHandlerFound() {
		ErrorDTO error = new ErrorDTO(404, "resource not found");
		return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);        
    }
	
}
