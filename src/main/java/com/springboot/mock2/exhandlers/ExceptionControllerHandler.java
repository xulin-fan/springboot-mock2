package com.springboot.mock2.exhandlers;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.NoHandlerFoundException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by barryfan on 6/19/19.
 */

@ControllerAdvice
@ResponseBody
public class ExceptionControllerHandler {

    @ExceptionHandler(NoHandlerFoundException.class)
    public String handleResult(HttpServletRequest request, HttpServletResponse response) {
        String mockUriMethod = "/mock/9-POST";
        String requestUriMethod = request.getRequestURI().concat("-")
                .concat(request.getMethod().toUpperCase());
        if (mockUriMethod.equals(requestUriMethod)) {
            return "success";
        }
        return null;
    }
}
