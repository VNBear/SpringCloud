package com.vnbear.springcloud.consumerservice;

import org.springframework.stereotype.Component;

/**
 * @Auther: VNBear
 * @Date: 2020/6/4 17:37
 * @Description:
 */
@Component
public class HelloRemoteHystrix implements HelloRemote {
    @Override
    public String hello(String name) {
        return "hello" +name+", this messge send failed ";
    }
}
