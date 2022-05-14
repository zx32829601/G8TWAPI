package sevice;

import Entity.Condition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.ConditionRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class ConditionService {

    @Autowired
    private ConditionRepository conditionDAO;

    public void creatCondition() {

    }

    public void DeteminCondition() {

    }

    public List<Condition> findAll() {
        List<Condition> conditions = new ArrayList<Condition>();
        conditions.addAll(conditionDAO.findAll());
        return conditions;

    }
}
