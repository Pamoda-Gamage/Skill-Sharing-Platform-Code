package com.PAF.SkillShare.controller;

import com.PAF.SkillShare.model.LearningPlan;
import com.PAF.SkillShare.service.LearningPlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/learning-plans")
public class LearningPlanController {
    @Autowired
    private LearningPlanService service;

    @GetMapping
    public List<LearningPlan> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public LearningPlan get(@PathVariable String id) {
        return service.getById(id);
    }

    @PostMapping
    public LearningPlan create(@RequestBody LearningPlan plan) {
        return service.create(plan);
    }

    @PutMapping("/{id}")
    public LearningPlan update(@PathVariable String id, @RequestBody LearningPlan plan) {
        return service.update(id, plan);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable String id) {
        service.delete(id);
        return ResponseEntity.ok("Learning plan with ID " + id + " was deleted successfully.");
    }
}
