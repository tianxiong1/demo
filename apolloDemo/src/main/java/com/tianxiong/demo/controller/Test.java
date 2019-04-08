package com.tianxiong.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.UUID;

@Controller
@RequestMapping("/test")
public class Test {
    @Autowired
    StringRedisTemplate stringRedisTemplate;

    @Autowired
    RedisTemplate redisTemplate;

    @RequestMapping(value = "a",method = RequestMethod.POST)
    @ResponseBody
     public String a(){
        String a = stringRedisTemplate.opsForValue().get("redis");
        return a;
     }

    @RequestMapping(value = "b",method = RequestMethod.POST)
    @ResponseBody
    public Object b(){
        return redisTemplate.opsForValue().get("redis");
    }

    @RequestMapping(value = "c",method = RequestMethod.POST)
    @ResponseBody
    public String c(){
        return UUID.randomUUID().toString();
    }
}
