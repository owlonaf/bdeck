package com.imukov.bdeck.controller;

import com.imukov.bdeck.service.PollService;
import com.imukov.bdeck.vo.PollVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/poll")
public class PollController {
    @Autowired
    private PollService pollService;

    @GetMapping("/res")
    public List<PollVo> getRes(){
         return pollService.votesCount();
    }
}
