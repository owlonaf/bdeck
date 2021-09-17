package com.imukov.bdeck.dao;

import com.imukov.bdeck.vo.SocialVo;

public interface SocialDao {
    public SocialVo getSocialVo(String nickname);

    public void setSocialInfo(String user, String vk, String inst, String tg, String yt);
}
