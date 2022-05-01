package com.imukov.bdeck.service;

import com.imukov.bdeck.domain.PollEntity;
import com.imukov.bdeck.vo.PollVo;

import java.util.List;

public interface PollService {
    public void saveVote(Boolean firstVar, Boolean secondVar, Boolean thirdVar, Boolean fourthVar);
    public List<PollVo> votesCount();
}
