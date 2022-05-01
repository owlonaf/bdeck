package com.imukov.bdeck.controller;

import com.imukov.bdeck.domain.PersonEntity;
import com.imukov.bdeck.repository.PersonRepository;
import com.imukov.bdeck.service.LogService;
import com.imukov.bdeck.vo.PersonVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/auth")
public class AuthorizationController {

    @Autowired
    private LogService logService;

    @RequestMapping(value = { "/"}, method = RequestMethod.GET)
    public String index(Model model) {
        String message = "Hello Spring Boot + JSP";
        model.addAttribute("message", message);
        return "index";
    }

    @GetMapping("/get")
    public List<PersonVo> getAll() {
        return logService.getProfiles();
    }

}
