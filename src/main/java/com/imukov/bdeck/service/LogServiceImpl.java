package com.imukov.bdeck.service;

import com.imukov.bdeck.dao.PersonDao;
import com.imukov.bdeck.vo.PersonVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class LogServiceImpl implements LogService{

    @Autowired
    PersonDao personDao;

    @Override
    public PersonVo registred(String name, String nickname, String password, String confirmedPassword) {
        if (password == confirmedPassword){
            personDao.createUser(name, nickname, password);
            return personDao.getPersonVo(nickname);
        }
        return null;
    }

    @Override
    public PersonVo login(String nickname, String password) {
        PersonVo personVo = personDao.getPersonVo(nickname);
        if (personVo.getPassword() == password){
            return personVo;
        }
        return null;
    }
}
