package com.imukov.bdeck.controller;

import com.imukov.bdeck.service.LogService;
import com.imukov.bdeck.vo.PersonVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthorizationController {

    @Autowired
    private LogService logService;

    @RequestMapping(method = RequestMethod.POST)
    public PersonVo registration (@RequestParam("name") String name,
                                  @RequestParam("nickname") String nickname,
                                  @RequestParam("password") String password,
                                  @RequestParam("confirmPassword") String confirmPassword){
        return logService.registred(name, nickname, password, confirmPassword);
    }
}
