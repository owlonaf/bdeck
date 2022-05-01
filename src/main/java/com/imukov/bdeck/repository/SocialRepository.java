package com.imukov.bdeck.repository;

import com.imukov.bdeck.domain.SocialEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SocialRepository extends JpaRepository<SocialEntity, String> {
}
