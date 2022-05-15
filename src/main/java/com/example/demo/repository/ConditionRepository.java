package com.example.demo.repository;

import com.example.demo.Entity.Condition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ConditionRepository extends JpaRepository<Condition, Long> {
}
