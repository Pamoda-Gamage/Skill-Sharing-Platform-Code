package com.PAF.SkillShare.service;

import com.PAF.SkillShare.model.LearningProgress;
import com.PAF.SkillShare.repository.LearningProgressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LearningProgressService {
    @Autowired
    private LearningProgressRepository repo;

    public List<LearningProgress> getAll() {
        return repo.findAll();
    }

    public LearningProgress getById(String id) {
        return repo.findById(id).orElse(null);
    }

    public List<LearningProgress> getByUserId(String userId) {
        return repo.findByUserId(userId);
    }

    public List<LearningProgress> getByLearningPlanId(String planId) {
        return repo.findByLearningPlanId(planId);
    }

    public LearningProgress create(LearningProgress progress) {
        return repo.save(progress);
    }

    public LearningProgress update(String id, LearningProgress progress) {
        progress.setId(id);
        return repo.save(progress);
    }

    public void delete(String id) {
        repo.deleteById(id);
    }
}
