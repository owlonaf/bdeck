package com.imukov.bdeck.service;

import com.imukov.bdeck.vo.PersonVo;

import java.util.List;

public interface LogService {
    public PersonVo registred(String name, String nickname, String password, String confirmedPassword);

    public PersonVo login(String nickname, String password);

    public void deleteProfile(PersonVo personVo, String password);

    public PersonVo changePassword(PersonVo personVo, String oldPassword, String newPassword, String oneMorePassword);

    public List<PersonVo> getProfiles();
}
