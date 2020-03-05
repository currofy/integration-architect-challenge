package com.currofy.api.service.exception;

import com.currofy.api.core.enums.ExceptionCodeEnum;

public class ServiceException extends Exception  {
	
	private static final long serialVersionUID = 1L;
	private final String messageException;
	private final ExceptionCodeEnum exception;

	public ServiceException() {
		super();
		this.exception = ExceptionCodeEnum.GENERAL_ERROR;
		this.messageException = ExceptionCodeEnum.GENERAL_ERROR.getDescriptcion();
	}

	
	public ServiceException(ExceptionCodeEnum exceptionCode) {
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
