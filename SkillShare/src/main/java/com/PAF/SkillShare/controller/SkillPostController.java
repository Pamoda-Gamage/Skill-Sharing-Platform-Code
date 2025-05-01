package com.PAF.SkillShare.controller;

import com.PAF.SkillShare.model.SkillPost;
import com.PAF.SkillShare.service.SkillPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/posts")
public class SkillPostController {
    @Autowired
    private SkillPostService service;

    @GetMapping
    public List<SkillPost> getAll() { return service.getAll(); }
    @GetMapping("/{id}") public SkillPost get(@PathVariable String id) { return service.getById(id); }
    @PostMapping public SkillPost create(@RequestBody SkillPost post) { return service.create(post); }
    @PutMapping("/{id}") public SkillPost update(@PathVariable String id, @RequestBody SkillPost post) {
        return service.update(id, post);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable String id) {
        service.delete(id);
        return ResponseEntity.ok("Skill post with ID " + id + " was deleted successfully.");
    }
}

