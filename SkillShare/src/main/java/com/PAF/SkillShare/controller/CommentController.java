package com.PAF.SkillShare.controller;

import com.PAF.SkillShare.model.Comment;
import com.PAF.SkillShare.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/comments")
public class CommentController {
    @Autowired
    private CommentService service;

    @GetMapping
    public List<Comment> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Comment get(@PathVariable String id) {
        return service.getById(id);
    }

    @GetMapping("/post/{postId}")
    public List<Comment> getByPostId(@PathVariable String postId) {
        return service.getByPostId(postId);
    }

    @PostMapping
    public Comment create(@RequestBody Comment comment) {
        return service.create(comment);
    }

    @PutMapping("/{id}")
    public Comment update(@PathVariable String id, @RequestBody Comment comment) {
        return service.update(id, comment);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable String id) {
        service.delete(id);
        return ResponseEntity.ok("Comment with ID " + id + " was deleted successfully.");
    }

}
