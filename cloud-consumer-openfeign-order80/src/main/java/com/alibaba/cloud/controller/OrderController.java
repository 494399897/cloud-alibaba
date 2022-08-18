package com.alibaba.cloud.controller;

import com.alibaba.cloud.service.IPaymentFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Admin
 * @version 1.0
 * @project cloud-alibaba
 * @description controller
 * @date 2022/8/18 17:09:31
 */
@RestController
@RequestMapping("order")
public class OrderController {


    @Autowired
    private IPaymentFeignService iPaymentFeignService;

    @GetMapping("index")
    public String index(){
        return iPaymentFeignService.index();
    }


}
