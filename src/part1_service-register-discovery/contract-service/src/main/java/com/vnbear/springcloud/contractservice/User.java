package com.vnbear.springcloud.contractservice;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Auther: VNBear
 * @Date: 2020/6/3 14:13
 * @Description:
 */
@AllArgsConstructor
@Data
public class User implements Serializable {

    private String name;
    private int age;

}
