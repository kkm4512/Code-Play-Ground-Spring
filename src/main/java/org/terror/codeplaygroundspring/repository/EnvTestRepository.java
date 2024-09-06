package org.terror.codeplaygroundspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.terror.codeplaygroundspring.entity.EnvTestEntity;

public interface EnvTestRepository extends JpaRepository<EnvTestEntity, Long> {
}
