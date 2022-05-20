package com.example.demo.sevice;

import com.example.demo.Entity.Condition;
import com.example.demo.Entity.ConditionDTO;
import com.example.demo.Entity.Elder;
import com.example.demo.repository.ConditionRepository;
import com.example.demo.repository.Elderrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ConditionService {
    private int n;
    @Autowired
    private ConditionRepository conditionRepository;

    @Autowired
    private Elderrepository elderrepository;


    //createCondition
    public Condition createCondition(ConditionDTO request) {
        String state = "normal";
        if (request.getHeartrhythm() < 60 || request.getHeartrhythm() > 100) {
            state = "abnormal";

            n += 10;
        } else if (n != 0) {
            state = "normal but have precondition";
            n -= 1;
        }
        Long elderId = request.getElderID();
        Optional<Elder> _elder = elderrepository.findById(elderId);

        return conditionRepository.save(new Condition(request.getHeartrhythm(),
                request.getBloody_oxy(), request.getLonggps(), request.getLatigps(), state, _elder.get()));

    }

    public List<Condition> get_Condition(long id) {
        Optional<Elder> elder_data = elderrepository.findById(id);
        List<Condition> condition_data;
        if (elder_data.isPresent()) {
            condition_data = conditionRepository.findByElder(elder_data.get());
            System.out.println(condition_data.toString());
        } else {
            condition_data = new ArrayList<Condition>();
        }
        return condition_data;
    }

    public Condition changenotify(long id) {
        Optional<Condition> condition = conditionRepository.findById(id);
        condition.get().setNotify_accept(true);
        n = 0;
        return conditionRepository.save(condition.get());

    }

    public List<Condition> get_top10condition(long id) {
        Optional<Elder> elder_data = elderrepository.findById(id);
        List<Condition> condition_data;
        if (elder_data.isPresent()) {
            condition_data = conditionRepository.findFirst10ByElder(elder_data.get());
        } else {
            condition_data = new ArrayList<Condition>();
        }
        return condition_data;
    }

}
