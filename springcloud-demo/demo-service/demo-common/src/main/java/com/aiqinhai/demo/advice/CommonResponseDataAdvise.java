/**
 * @author ：yz
 * @date ：Created in 2019/8/5 15:11
 * @description：
 * @modified By：
 * @version: $
 */
package com.aiqinhai.demo.advice;

import com.aiqinhai.demo.annotation.IgnoreResponseAdvice;
import com.aiqinhai.demo.vo.CommonResponse;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

@RestControllerAdvice
public class CommonResponseDataAdvise implements ResponseBodyAdvice<Object> {

    @Override
    @SuppressWarnings("all")
    public boolean supports(MethodParameter returnType, Class<? extends HttpMessageConverter<?>> converterType) {
        if (returnType.getDeclaringClass().isAnnotationPresent(
                IgnoreResponseAdvice.class
        )) {
            return false;
        }

        if (returnType.getMethod().isAnnotationPresent(
                IgnoreResponseAdvice.class
        )) {
            return false;
        }

        return true;
    }

    @Nullable
    @Override
    @SuppressWarnings("all")
    public Object beforeBodyWrite(@Nullable Object body, MethodParameter returnType, MediaType selectedContentType, Class<? extends HttpMessageConverter<?>> selectedConverterType, ServerHttpRequest request, ServerHttpResponse response) {
        CommonResponse<Object> commonResponse = new CommonResponse<>(0, "");
        if (null == body) {
            return commonResponse;
        } else if (body instanceof CommonResponse) {
            commonResponse = (CommonResponse<Object>) body;
        } else {
            commonResponse.setData(body);
        }

        return commonResponse;
    }
}
