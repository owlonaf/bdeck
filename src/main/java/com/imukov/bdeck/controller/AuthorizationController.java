package com.imukov.bdeck.controller;

import com.imukov.bdeck.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/auth")
public class AuthorizationController {

    @Autowired
    private LogService logService;

    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public
}
