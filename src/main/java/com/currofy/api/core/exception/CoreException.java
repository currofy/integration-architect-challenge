package com.currofy.api.core.exception;

import com.currofy.api.core.enums.ExceptionCodeEnum;

public class CoreException extends Exception {
	private static final long serialVersionUID = 1L;
	private final String messageException;
	private final ExceptionCodeEnum exception;

	public CoreException() {
		super();
		this.exception = ExceptionCodeEnum.GENERAL_ERROR;
		this.messageException = ExceptionCodeEnum.GENERAL_ERROR.getDescriptcion();
	}


	public CoreException(ExceptionCodeEnum exceptionCode) {
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
