package com.PAF.SkillShare.service;

import com.PAF.SkillShare.model.Comment;
import com.PAF.SkillShare.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {
    @Autowired
    private CommentRepository repo;

    public List<Comment> getAll() {
        return repo.findAll();
    }

    public Comment getById(String id) {
        return repo.findById(id).orElse(null);
    }

    public List<Comment> getByPostId(String postId) {
        return repo.findByPostId(postId);
    }

    public Comment create(Comment comment) {
        return repo.save(comment);
    }

    public Comment update(String id, Comment comment) {
        comment.setId(id);
        return repo.save(comment);
    }

    public void delete(String id) {
        repo.deleteById(id);
    }
}
