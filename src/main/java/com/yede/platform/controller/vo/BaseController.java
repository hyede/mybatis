package com.yede.platform.controller.vo;

import com.yede.platform.controller.ResponseVO;
import com.yede.platform.exception.ErrorCode;

import java.io.Serializable;


public abstract class BaseController {

    protected <T extends Serializable> ResponseVO<T> successResponse(T body) {
        ResponseVO resp = new ResponseVO();
        resp.setResponseStatus(ResponseVO.ResponseStatus.succeed);
        resp.setResponseBody(body);
        return resp;

    }

    protected <T extends Serializable> ResponseVO<T> successResponse() {
        ResponseVO resp = new ResponseVO();
        resp.setResponseStatus(ResponseVO.ResponseStatus.succeed);
        return resp;

    }

    protected <T extends Serializable> ResponseVO<T> failedResponse(ErrorCode errorCode) {
        ResponseVO resp = new ResponseVO();
        resp.setResponseStatus(ResponseVO.ResponseStatus.failed);
        resp.setErrorCode(errorCode);
        return resp;
    }
}
