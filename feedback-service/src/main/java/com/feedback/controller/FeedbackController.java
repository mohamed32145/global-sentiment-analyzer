package com.feedback.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/feedback")
public class FeedbackController {
    private final KafkaTemplate<String, String> kafkaTemplate;

    public FeedbackController(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @PostMapping
    public ResponseEntity<?> sendFeedback(@RequestBody String feedback) {
        kafkaTemplate.send("feedback", feedback);
        return ResponseEntity.ok("Feedback sent to Kafka");
    }
}
