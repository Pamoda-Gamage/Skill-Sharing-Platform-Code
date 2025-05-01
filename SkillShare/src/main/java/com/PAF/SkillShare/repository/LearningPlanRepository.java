package com.PAF.SkillShare.repository;

import com.PAF.SkillShare.model.LearningPlan;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LearningPlanRepository extends MongoRepository<LearningPlan, String> {
    // Optionally add custom query methods if needed
}
