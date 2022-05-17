package com.example.demo.sevice;

import com.example.demo.repository.ConditionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConditionService {

    @Autowired
    private ConditionRepository conditionRepository;

    
}
