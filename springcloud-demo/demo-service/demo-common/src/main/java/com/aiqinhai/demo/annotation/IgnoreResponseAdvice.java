/**
 * @author ：yz
 * @date ：Created in 2019/8/5 15:14
 * @description：
 * @modified By：
 * @version: $
 */
package com.aiqinhai.demo.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface IgnoreResponseAdvice {

}
