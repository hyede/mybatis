package com.yede.platform.controller;


import com.yede.platform.controller.vo.ValidationErrorBean;
import com.yede.platform.exception.ApplicationException;
import com.yede.platform.exception.ErrorCode;
import com.yede.platform.exception.ServiceException;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;


import java.util.ArrayList;
import java.util.List;


@ControllerAdvice
public class ExceptionHandlerController {

	@ExceptionHandler
	@ResponseBody
	public ResponseVO handleException(Exception e) throws Exception {
		ResponseVO resp = new ResponseVO();
		resp.setResponseStatus(ResponseVO.ResponseStatus.failed);
		if(e instanceof MethodArgumentNotValidException) {
			List<ValidationErrorBean> validationErrors = new ArrayList<> ();
			MethodArgumentNotValidException validError = (MethodArgumentNotValidException) e;
			List<FieldError> fieldErrors = validError.getBindingResult().getFieldErrors();
			for(FieldError fe : fieldErrors) {
				ValidationErrorBean validationError = new ValidationErrorBean();
				validationError.setFiledName(fe.getField());
				validationError.setRejectedValue(fe.getRejectedValue());
				validationError.setMessage(fe.getDefaultMessage());
				validationErrors.add(validationError);
			}
			resp.setResponseBody(validationErrors);
			resp.setErrorCode(ErrorCode.validation_error);
		} else if(e instanceof ServiceException) {
			resp.setErrorCode(((ServiceException) e).getErrorCode());
		}  else {
			throw new ApplicationException(e);
		}
		return resp;
	}
}
