/**
 * @author ：yz
 * @date ：Created in 2019/8/5 9:53
 * @description：网关启动程序
 * @modified By：
 * @version: $
 */
package com.aiqinhai.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringCloudApplication
public class ZuulGatewayApplication {
    public static void main(String[] args){
        SpringApplication.run(ZuulGatewayApplication.class,args);
    }
}
