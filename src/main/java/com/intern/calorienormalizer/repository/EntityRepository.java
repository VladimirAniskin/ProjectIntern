package com.intern.calorienormalizer.repository;

import com.intern.calorienormalizer.entity.Entity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EntityRepository extends JpaRepository<Entity, Long> {

}
