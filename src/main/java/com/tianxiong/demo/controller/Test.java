package com.tianxiong.demo.controller;

import com.alibaba.fastjson.JSON;
import com.tianxiong.demo.api.Parent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.UUID;

@Controller
@RequestMapping("/test")
public class Test {
    @Autowired
    StringRedisTemplate stringRedisTemplate;

    @Autowired
    RedisTemplate redisTemplate;

  @Qualifier("child1")
    @Autowired
    Parent parent;
/*    @Resource(name="child1")
    Parent parent;*/


/*    @Autowired
    Parent parent;*/

    @RequestMapping(value = "a",method = RequestMethod.POST)
    @ResponseBody
     public String a(){
       // String a = stringRedisTemplate.opsForValue().get("redis");
        parent.say();
        int a = 1;
        if(a>0){
            System.out.println("进来了");
            throw  new RuntimeException("1");
        }
        return "1";
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

    @RequestMapping
    @ResponseBody
    public String getIp(HttpServletRequest request){
        String localAddr = request.getLocalAddr();
        String remoteAddr = request.getRemoteAddr();
        return localAddr+"----"+remoteAddr;
    }

    @RequestMapping("/testRequest")
    @ResponseBody
    public String testRequestAttr(@RequestBody  RequestVo request){
        System.out.println(request);
        return "123";
    }

    @RequestMapping("/claim")
    @ResponseBody
    public String claim(@RequestBody  ClaimRequest  request){
        System.out.println(request.toString());
        ClaimResponseVo response = new ClaimResponseVo();
        response.setCode("200");
        response.setMessage("成功");
        response.setStatus("success");
        String s =  JSON.toJSONString(response);
        return s;
    }

    @RequestMapping("/file")
    @ResponseBody
    public String file(@RequestBody  ClaimRequest  request){
        System.out.println(request.toString());
        ClaimResponseVo response = new ClaimResponseVo();
        response.setCode("200");
        response.setMessage("成功");
        response.setStatus("success");
        String s =  JSON.toJSONString(response);
        return s;
    }


}
