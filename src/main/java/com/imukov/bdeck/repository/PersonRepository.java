package com.imukov.bdeck.repository;

import com.imukov.bdeck.domain.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PersonRepository extends JpaRepository<PersonEntity, UUID> {
    PersonEntity findPersonEntityByNickname(String nickname);
}
