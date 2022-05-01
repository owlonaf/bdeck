package com.imukov.bdeck.repository;

import com.imukov.bdeck.domain.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PersonRepository extends JpaRepository<PersonEntity, UUID> {
    PersonEntity findPersonEntityByNickname(String nickname);
}
