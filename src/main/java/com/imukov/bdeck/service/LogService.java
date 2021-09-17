package com.imukov.bdeck.service;

import com.imukov.bdeck.vo.PersonVo;

public interface LogService {
    public PersonVo registred(String name, String nickname, String password, String confirmedPassword);

    public PersonVo login(String nickname, String password);
}
