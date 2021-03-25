package com.ivoronline.springboot_service_controller.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

  @ResponseBody
  @RequestMapping("/Hello")
  public String hello() {

    //BUSINESS LOGIC
    String result = "Hello from Controller";

    //RETURN RESULT
    return result;

  }

}


