package com.imukov.bdeck.dao;

import com.imukov.bdeck.domain.PersonEntity;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public class PersonDaoImpl implements PersonDao{

    

    @Override
    public void createUser(String name, String nickname, String password) {
        sessionFactory.getCurrentSession().save(new PersonEntity(UUID.randomUUID(), name, nickname, password));
    }

    @Override
    public void deleteUser(String nickname, String password) {
        sessionFactory.getCurrentSession().delete(PersonEntity.class.);
    }
}
