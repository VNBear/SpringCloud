package com.vnbear.springcloud.consumerservice;

import com.vnbear.springcloud.contractservice.User;
import com.vnbear.springcloud.contractservice.UserContract;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Auther: VNBear
 * @Date: 2020/6/3 16:03
 * @Description:
 */

@RestController
public class UserController {


    @Autowired
    private UserContract userContract;

    @PostMapping("/user")
    public void add(@RequestBody User user) {
        userContract.add(user);
    }

    @GetMapping("/user/{name}")
    public User findByName(@PathVariable String name) {
        return userContract.findByName(name);
    }

    @GetMapping("/users")
    public List<User> findAll() {
        return userContract.findAll();
    }

}
