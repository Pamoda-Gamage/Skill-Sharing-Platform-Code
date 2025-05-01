package com.PAF.SkillShare.repository;

import com.PAF.SkillShare.model.SkillPost;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SkillPostRepository extends MongoRepository<SkillPost, String> {
}

