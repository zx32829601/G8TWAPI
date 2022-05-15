package com.example.demo.sevice;

import com.example.demo.repository.GuardianRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class Guardianservice {

    @Autowired
    private GuardianRepository guardianRepository;
}
