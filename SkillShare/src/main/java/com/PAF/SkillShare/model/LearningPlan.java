package com.PAF.SkillShare.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "learningplans")
public class LearningPlan {

    @Id
    private String id;
    private String userId;
    private String title;
    private List<LearningTopic> topics;
    private boolean completed;

    // Constructors
    public LearningPlan() {}

    public LearningPlan(String id, String userId, String title, List<LearningTopic> topics, boolean completed) {
        this.id = id;
        this.userId = userId;
        this.title = title;
        this.topics = topics;
        this.completed = completed;
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<LearningTopic> getTopics() {
        return topics;
    }

    public void setTopics(List<LearningTopic> topics) {
        this.topics = topics;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    // Static inner class
    public static class LearningTopic {
        private String topic;
        private String resourceLink;
        private String targetDate;
        private boolean done;

        // Constructors
        public LearningTopic() {}

        public LearningTopic(String topic, String resourceLink, String targetDate, boolean done) {
            this.topic = topic;
            this.resourceLink = resourceLink;
            this.targetDate = targetDate;
            this.done = done;
        }

        // Getters and Setters
        public String getTopic() {
            return topic;
        }

        public void setTopic(String topic) {
            this.topic = topic;
        }

        public String getResourceLink() {
            return resourceLink;
        }

        public void setResourceLink(String resourceLink) {
            this.resourceLink = resourceLink;
        }

        public String getTargetDate() {
            return targetDate;
        }

        public void setTargetDate(String targetDate) {
            this.targetDate = targetDate;
        }

        public boolean isDone() {
            return done;
        }

        public void setDone(boolean done) {
            this.done = done;
        }
    }
}
