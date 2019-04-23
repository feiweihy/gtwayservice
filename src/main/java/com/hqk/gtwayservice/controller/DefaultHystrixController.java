package com.hqk.gtwayservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class DefaultHystrixController {

    @RequestMapping("/defaultfallback")
    public Map<String,String> defaultfallback(){
        System.out.println("降级操作...");
        Map<String,String> map = new HashMap<>();
        map.put("resultCode","false");
        map.put("resultMessage","服务异常");
        map.put("resultObj","这里测试网关服务熔断");
        return map;
    }

}
