package com.currofy.api.controllers.exception;

import org.springframework.stereotype.Component;

import com.currofy.api.core.enums.ExceptionCodeEnum;

@Component
public class ControllerException extends Exception {
	
	private static final long serialVersionUID = 1L;
	private final String messageException;
	private final ExceptionCodeEnum exception;

	public ControllerException() {
		super();
		this.exception = ExceptionCodeEnum.GENERAL_ERROR;
		this.messageException = ExceptionCodeEnum.GENERAL_ERROR.getDescriptcion();
	}

	
	public ControllerException(ExceptionCodeEnum exceptionCode) {
		super();
		this.exception = exceptionCode;
		this.messageException = exceptionCode.getDescriptcion();
	}

	@Override
	public String getMessage() {
		return messageException;
	}

	public ExceptionCodeEnum getExceptionType() {
		return this.exception;
	}

	
}
