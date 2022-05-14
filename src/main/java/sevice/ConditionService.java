package sevice;

import Entity.Condition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.ConditionDAO;

import java.util.ArrayList;
import java.util.List;

@Service
public class ConditionService {

    @Autowired
    private ConditionDAO conditionDAO;

    public void creatCondition() {

    }

    public void DeteminCondition() {

    }

    public List<Condition> findAll() {
        List<Condition> conditions = new ArrayList<Condition>();
        conditionDAO.findAll().forEach(e -> conditions.add(e));
        return conditions;

    }
}
