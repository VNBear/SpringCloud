package com.vnbear.springcloud.contractservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * @Auther: VNBear
 * @Date: 2020/6/3 14:14
 * @Description:
 */
@FeignClient("service-provider")
public interface UserContract {
    @PostMapping("/user")
    void add(@RequestBody User user);

    @GetMapping("/user/{name}")
    User findByName(@PathVariable String name);

    @GetMapping("/users")
    List<User> findAll();

}
