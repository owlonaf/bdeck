package com.imukov.bdeck.controller;

import com.imukov.bdeck.service.LogService;
import com.imukov.bdeck.vo.PersonVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
public class AuthorizationController {

    @Autowired
    private LogService logService;

//    @RequestMapping(method = RequestMethod.POST)
//    public PersonVo registration (@RequestParam("name") String name,
//                                  @RequestParam("nickname") String nickname,
//                                  @RequestParam("password") String password,
//                                  @RequestParam("confirmPassword") String confirmPassword){
//        return logService.registred(name, nickname, password, confirmPassword);
//    }

    @RequestMapping(value = { "/"}, method = RequestMethod.GET)
    public String index(Model model) {
        String message = "Hello Spring Boot + JSP";
        model.addAttribute("message", message);
        return "index";
    }
}
