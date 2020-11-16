/**
 * @author ：yz
 * @date ：Created in 2019/8/5 16:28
 * @description：
 * @modified By：
 * @version: $
 */
package com.aiqinhai.demo.advice;

import com.aiqinhai.demo.exception.AdException;
import com.aiqinhai.demo.vo.CommonResponse;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

@RestControllerAdvice
public class GlobalExceptionAdvice {
    public CommonResponse<String> handlerAdException(HttpServletRequest req, AdException ex){
        CommonResponse<String> response=new CommonResponse<>(-1,"business error");
        response.setData(ex.getMessage());
        return response;
    }
}
