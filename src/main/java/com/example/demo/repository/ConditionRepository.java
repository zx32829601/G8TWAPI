package com.example.demo.repository;

import com.example.demo.Entity.Condition;
import com.example.demo.Entity.Elder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ConditionRepository extends JpaRepository<Condition, Long> {


    List<Condition> findByElder(Elder elder);


}
