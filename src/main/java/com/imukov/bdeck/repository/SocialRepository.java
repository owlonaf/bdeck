package com.imukov.bdeck.repository;

import com.imukov.bdeck.domain.SocialEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SocialRepository extends JpaRepository<SocialEntity, String> {
}
