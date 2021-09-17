package com.imukov.bdeck.vo;

import com.imukov.bdeck.domain.SocialEntity;
import lombok.Data;


@Data
public class SocialVo {
    private String user;
    private String vk;
    private String inst;
    private String tg;
    private String yt;

    public SocialVo(SocialEntity social){
        this.user = social.getUser();
        this.vk = social.getVk();
        this.inst = social.getInst();
        this.tg = social.getTg();
        this.yt = social.getYt();
    }
}
