/**
 * @author ：yz
 * @date ：Created in 2019/8/5 15:05
 * @description：统一响应
 * @modified By：
 * @version: $
 */
package com.aiqinhai.demo.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommonResponse<T> implements Serializable {
    private Integer code;
    private String message;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    private T data;

    public CommonResponse(Integer code,String message){
        this.code=code;
        this.message=message;
    }
}
