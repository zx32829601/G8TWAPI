package com.example.demo.sevice;

import com.example.demo.Entity.Condition;
import com.example.demo.Entity.Elder;
import com.example.demo.repository.ConditionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConditionService {

    @Autowired
    private ConditionRepository conditionRepository;

    public void creatCondition() {


    }

    public void DeteminCondition() {

    }

    public List<Condition> findByElder(Elder elder) {
        return conditionRepository.findByElder(elder);
    }
}
