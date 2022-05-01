package com.imukov.bdeck.repository;

import com.imukov.bdeck.domain.PollEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface PollRepository extends JpaRepository<PollEntity, UUID> {
    List<PollEntity> findAllByFirstVarIsTrue();
}
