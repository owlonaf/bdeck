package com.imukov.bdeck.vo;

import com.imukov.bdeck.domain.SocialEntity;
import lombok.Data;

import java.util.UUID;


@Data
public class SocialVo {
    private UUID id;
    private String vk;
    private String inst;
    private String tg;
    private String yt;

    public SocialVo(SocialEntity social){
        this.id = social.getId();
        this.vk = social.getVk();
        this.inst = social.getInst();
        this.tg = social.getTg();
        this.yt = social.getYt();
    }
}
