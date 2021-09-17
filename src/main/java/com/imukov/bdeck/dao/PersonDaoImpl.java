package com.imukov.bdeck.dao;

import com.imukov.bdeck.domain.PersonEntity;
import com.imukov.bdeck.vo.PersonVo;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.UUID;

@Repository
public class PersonDaoImpl implements PersonDao{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void createUser(String name, String nickname, String password) {
        entityManager.getTransaction().begin();
        entityManager.persist(new PersonEntity(UUID.randomUUID(), name, nickname, password));
        entityManager.getTransaction().commit();
    }

    @Override
    public PersonEntity getPerson(String nickname){
        PersonEntity person = entityManager.find(PersonEntity.class, new String(nickname));
        entityManager.detach(person);
        return person;
    }

    @Override
    public PersonVo getPersonVo(String nickname){
        PersonEntity person = entityManager.find(PersonEntity.class, new String(nickname));
        entityManager.detach(person);
        return new PersonVo(person);
    }

    @Override
    public void deleteUser(String nickname, String password) {
    entityManager.getTransaction().begin();
    PersonEntity person = entityManager.find(PersonEntity.class, new String(nickname));
    if (person.getPassword() == password){
        entityManager.remove(person);
    }
    entityManager.getTransaction().commit();
    }

    @Override
    public void changePassword(String nickname, String password, String newPassword){
        entityManager.getTransaction().begin();
        PersonEntity person = getPerson(nickname);
        if (person.getPassword() == password){
            person.setPassword(newPassword);
            entityManager.merge(person);
        } else {
            System.out.println("Wrong password");
        }
        entityManager.getTransaction().commit();
    }
}
