package com.csoptt.exception;

import com.csoptt.utils.exception.BaseException;

/**
 * 用户模块异常类
 *
 * @author qishao
 * @date 2018-11-17
 */
public class UserException extends BaseException {
    public UserException() {
    }

    public UserException(String message) {
        super(message);
    }

    public UserException(String errCode, String message) {
        super(errCode, message);
    }
}
