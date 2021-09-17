package com.imukov.bdeck.dao;

import com.imukov.bdeck.domain.SocialEntity;
import com.imukov.bdeck.vo.SocialVo;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class SocialDaoImpl implements SocialDao{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public SocialVo getSocialVo(String nickname) {
        entityManager.getTransaction().begin();
        SocialEntity socialEntity = entityManager.find(SocialEntity.class, new String(nickname));
        return new SocialVo(socialEntity);
    }

    @Override
    public void setSocialInfo(String user, String vk, String inst, String tg, String yt) {
        entityManager.getTransaction().begin();
        entityManager.persist(new SocialEntity(user, vk, inst, tg, yt));
        entityManager.getTransaction().commit();
    }
}
