package com.imukov.bdeck.service;

import com.imukov.bdeck.dao.PersonDao;
import com.imukov.bdeck.domain.PersonEntity;
import com.imukov.bdeck.repository.PersonRepository;
import com.imukov.bdeck.vo.PersonVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class LogServiceImpl implements LogService{

    @Autowired
    private PersonRepository personRepository;

    @Override
    public PersonVo registred(String name, String nickname, String password, String confirmedPassword){
        PersonEntity person = null;
        if (password == confirmedPassword){
            person = personRepository.saveAndFlush(new PersonEntity(name, nickname, password));
        }
        return new PersonVo(person);
    }

    @Override
    public PersonVo login(String nickname, String password) {
        PersonEntity person = personRepository.findPersonEntityByNickname(nickname);
        if (person.getPassword() == password){
            return new PersonVo(person);
        }
        return null;
    }

    @Override
    public void deleteProfile(PersonVo personVo, String password){
        PersonEntity person = personRepository.findPersonEntityByNickname(personVo.getNickname());
        if (person.getPassword() == password){
            personRepository.delete(person);
        }
    }

    @Override
    public PersonVo changePassword(PersonVo personVo, String oldPassword, String newPassword, String oneMorePassword){
        PersonEntity person = personRepository.findPersonEntityByNickname(personVo.getNickname());
        if (person.getPassword() == oldPassword && newPassword == oneMorePassword){
            person.setPassword(newPassword);
        }
        return new PersonVo(person);
    }

}
