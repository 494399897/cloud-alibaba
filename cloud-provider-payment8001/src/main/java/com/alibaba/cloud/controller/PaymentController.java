package com.alibaba.cloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Admin
 * @version 1.0
 * @project cloud-alibaba
 * @description 测试类
 * @date 2022/8/18 17:03:54
 */
@RestController
@RequestMapping("payment")
public class PaymentController {

    @GetMapping("/index")
    public String index(){
        return "payment success";
    }


}
