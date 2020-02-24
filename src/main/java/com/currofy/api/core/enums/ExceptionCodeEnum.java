package com.currofy.api.core.enums;

import com.currofy.api.core.exception.CoreException;

public enum ExceptionCodeEnum {
	
	GENERAL_ERROR(1000, "General Error"),
	NO_TYPE_AVAILABLE(1001, "Type invalid"),
	DATA_INVALID(1003, "Data invalid"),
	USER_NOT_FOUND(1005, "User not Found"),
	USER_WITHOUT_TICKETS (1006, "User without tickets");
	


	private int value;
	private String description;

	private ExceptionCodeEnum(int value, String description) {
		this.value = value;
		this.description = description;
	}

	public int getValue() {
		return value;
	}

	public String getDescriptcion() {
		return description;
	}

	public ExceptionCodeEnum getExceptionCodeByValue(int value) throws CoreException {
		for (ExceptionCodeEnum type : ExceptionCodeEnum.values()) {
			if (type.getValue() == value) {
				return type;
			}
		}
		throw new CoreException(NO_TYPE_AVAILABLE);
	}

}
