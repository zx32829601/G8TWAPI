package com.example.demo.sevice;


import com.example.demo.repository.Elderrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Elderservice {

    @Autowired
    private Elderrepository elderrepository;
}
