package com.alibaba.cloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Admin
 * @version 1.0
 * @project cloud-alibaba
 * @description feign接口
 * @date 2022/8/18 17:07:28
 */
@FeignClient(value = "provider-payment")
@Service
public interface IPaymentFeignService {


    @GetMapping("/payment/index")
    String index();

}
