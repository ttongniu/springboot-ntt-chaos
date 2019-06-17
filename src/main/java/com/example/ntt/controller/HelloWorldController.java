package com.example.ntt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @ClassName HelloWorldController
 * @Description
 * @Author niutongtong
 * @Date 2019-06-15 19:51
 * @Version V1.0
 **/
@Controller
@RequestMapping(value="/")
public class HelloWorldController {
  @RequestMapping(value="say", method= RequestMethod.GET)
    public   String  sayHello(){
      return  "hello world!!!";
    }

}
