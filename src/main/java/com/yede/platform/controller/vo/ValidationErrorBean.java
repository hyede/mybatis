package com.yede.platform.controller.vo;

import java.io.Serializable;

public class ValidationErrorBean  implements Serializable {

	/**
     *
	 */
	private static final long serialVersionUID = 1L;
	
	private String filedName;
	private Object rejectedValue;
	private String message;
	
	public ValidationErrorBean() {
		
	}

	public String getFiledName() {
		return filedName;
	}

	public void setFiledName(String filedName) {
		this.filedName = filedName;
	}

	public Object getRejectedValue() {
		return rejectedValue;
	}

	public void setRejectedValue(Object rejectedValue) {
		this.rejectedValue = rejectedValue;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}
