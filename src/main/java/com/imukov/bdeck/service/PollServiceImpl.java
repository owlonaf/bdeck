package com.imukov.bdeck.service;

import com.imukov.bdeck.domain.PollEntity;
import com.imukov.bdeck.repository.PollRepository;
import com.imukov.bdeck.vo.PollVo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PollServiceImpl implements PollService{

    @Autowired
    private final PollRepository pollRepository;

    @Override
    public void saveVote(Boolean firstVar, Boolean secondVar, Boolean thirdVar, Boolean fourthVar) {
        pollRepository.save(new PollEntity(firstVar, secondVar, thirdVar, fourthVar));
    }

    @Override
    public List<PollVo> votesCount(){
        List<PollEntity> list = pollRepository.findAllByFirstVarIsTrue();
        List<PollVo> pollVosList = new ArrayList<>();
        for (PollEntity pollEntity : list) {
            pollVosList.add(new PollVo(pollEntity));
        }
        return pollVosList;
    }
}
