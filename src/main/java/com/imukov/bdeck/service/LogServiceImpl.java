package com.imukov.bdeck.service;

import com.imukov.bdeck.domain.PersonEntity;
import com.imukov.bdeck.repository.PersonRepository;
import com.imukov.bdeck.vo.PersonVo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class LogServiceImpl implements LogService {

    private final PersonRepository personRepository;

    @Override
    public PersonVo registred(String name, String username, String password, String confirmedPassword) {
        PersonEntity person = null;
        if (password == confirmedPassword) {
            person = personRepository.save(new PersonEntity(name, username, password));
        }
        return new PersonVo(person);
    }

    @Override
    public PersonVo login(String username, String password) {
        PersonEntity person = personRepository.findPersonEntityByUsername(username);
        if (person.getPassword() == password) {
            return new PersonVo(person);
        }
        return null;
    }

    @Override
    @Transactional
    public void deleteProfile(PersonVo personVo, String password) {
        PersonEntity person = personRepository.findPersonEntityByUsername(personVo.getUsername());
        if (person.getPassword() == password) {
            personRepository.delete(person);
        }
    }

    @Override
    public PersonVo changePassword(PersonVo personVo, String oldPassword, String newPassword, String oneMorePassword) {
        PersonEntity person = personRepository.findPersonEntityByUsername(personVo.getUsername());
        if (person.getPassword() == oldPassword && newPassword == oneMorePassword) {
            person.setPassword(newPassword);
        }
        return new PersonVo(person);
    }

    @Override
    public List<PersonVo> getProfiles() {
        personRepository.save(new PersonEntity("kkk", "lll", "123"));
        List<PersonEntity> persons = personRepository.findAll();
        List<PersonVo> result = new ArrayList<>();
        for (PersonEntity personEntity : persons) {
            result.add(new PersonVo(personEntity));
        }
        return result;
    }
}
