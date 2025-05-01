package com.PAF.SkillShare.service;

import com.PAF.SkillShare.model.LearningPlan;
import com.PAF.SkillShare.repository.LearningPlanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LearningPlanService {
    @Autowired
    private LearningPlanRepository repo;

    public List<LearningPlan> getAll() {
        return repo.findAll();
    }

    public LearningPlan getById(String id) {
        return repo.findById(id).orElse(null);
    }

    public LearningPlan create(LearningPlan plan) {
        return repo.save(plan);
    }

    public LearningPlan update(String id, LearningPlan plan) {
        plan.setId(id);
        return repo.save(plan);
    }

    public void delete(String id) {
        repo.deleteById(id);
    }
}
