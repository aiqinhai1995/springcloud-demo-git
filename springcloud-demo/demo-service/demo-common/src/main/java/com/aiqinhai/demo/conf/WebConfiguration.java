/**
 * @author ：yz
 * @date ：Created in 2019/8/5 16:37
 * @description：配置转换器
 * @modified By：
 * @version: $
 */
package com.aiqinhai.demo.conf;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

@Configuration
public class WebConfiguration implements WebMvcConfigurer {
    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        converters.clear();
        converters.add(new MappingJackson2HttpMessageConverter());
    }
}
