package com.PAF.SkillShare.service;

import com.PAF.SkillShare.model.SkillPost;
import com.PAF.SkillShare.repository.SkillPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkillPostService {
    @Autowired
    private SkillPostRepository repo;

    public List<SkillPost> getAll() { return repo.findAll(); }
    public SkillPost getById(String id) { return repo.findById(id).orElse(null); }
    public SkillPost create(SkillPost post) { return repo.save(post); }
    public SkillPost update(String id, SkillPost post) {
        post.setId(id);
        return repo.save(post);
    }
    public void delete(String id) { repo.deleteById(id); }
}

