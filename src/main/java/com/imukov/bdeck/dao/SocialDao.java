package com.imukov.bdeck.dao;

import com.imukov.bdeck.vo.SocialVo;

import java.util.UUID;

public interface SocialDao {
    public SocialVo getSocialVo(String nickname);

    public void setSocialInfo(UUID id, String vk, String inst, String tg, String yt);
}
