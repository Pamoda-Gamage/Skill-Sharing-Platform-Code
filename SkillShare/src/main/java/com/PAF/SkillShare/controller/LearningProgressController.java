package com.PAF.SkillShare.controller;

import com.PAF.SkillShare.model.LearningProgress;
import com.PAF.SkillShare.service.LearningProgressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/progress")
public class LearningProgressController {
    @Autowired
    private LearningProgressService service;

    @GetMapping
    public List<LearningProgress> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public LearningProgress get(@PathVariable String id) {
        return service.getById(id);
    }

    @GetMapping("/user/{userId}")
    public List<LearningProgress> getByUser(@PathVariable String userId) {
        return service.getByUserId(userId);
    }

    @GetMapping("/plan/{planId}")
    public List<LearningProgress> getByPlan(@PathVariable String planId) {
        return service.getByLearningPlanId(planId);
    }

    @PostMapping
    public LearningProgress create(@RequestBody LearningProgress progress) {
        return service.create(progress);
    }

    @PutMapping("/{id}")
    public LearningProgress update(@PathVariable String id, @RequestBody LearningProgress progress) {
        return service.update(id, progress);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable String id) {
        service.delete(id);
        return ResponseEntity.ok("Learning progress with ID " + id + " was deleted successfully.");
    }
}
