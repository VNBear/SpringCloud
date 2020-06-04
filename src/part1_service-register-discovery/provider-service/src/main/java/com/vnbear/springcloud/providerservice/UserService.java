package com.vnbear.springcloud.providerservice;

import com.vnbear.springcloud.contractservice.User;
import com.vnbear.springcloud.contractservice.UserContract;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @Auther: VNBear
 * @Date: 2020/6/3 14:36
 * @Description:
 */
@RestController
public class UserService implements UserContract {

    private static final Set<User> userSet = new HashSet<>();

    static {
        userSet.add(new User("Alex", 28));
        userSet.add(new User("Lambert", 32));
        userSet.add(new User("Diouf", 30));
    }


    @Override
    public void add(User user) {
        userSet.add(user);
    }

    @Override
    public User findByName(String name) {
        return userSet.stream()
                .filter(user -> user.getName().equals(name))
                .findFirst()
                .get();
    }

    @Override
    public List<User> findAll() {
        return new ArrayList<>(userSet);
    }
}
