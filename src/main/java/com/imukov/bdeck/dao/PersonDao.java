package com.imukov.bdeck.dao;

import com.imukov.bdeck.domain.PersonEntity;
import com.imukov.bdeck.vo.PersonVo;

public interface PersonDao{
    public void createUser(String name, String nickname, String password);

    public PersonEntity getPerson(String nickname);

    public PersonVo getPersonVo(String nickname);

    public void deleteUser(String nickname, String password);

    public void changePassword(String nickname, String password, String newPassword);
}
