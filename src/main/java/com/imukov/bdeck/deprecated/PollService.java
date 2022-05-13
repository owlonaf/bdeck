package com.imukov.bdeck.deprecated;

import java.util.List;

public interface PollService {
    public void saveVote(Boolean firstVar, Boolean secondVar, Boolean thirdVar, Boolean fourthVar);
    public List<PollVo> votesCount();
}
