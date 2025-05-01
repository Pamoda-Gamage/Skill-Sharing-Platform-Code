package com.PAF.SkillShare.repository;

import com.PAF.SkillShare.model.LearningProgress;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface LearningProgressRepository extends MongoRepository<LearningProgress, String> {
    List<LearningProgress> findByUserId(String userId);
    List<LearningProgress> findByLearningPlanId(String learningPlanId);
}
