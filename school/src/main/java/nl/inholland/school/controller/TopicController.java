package nl.inholland.school.controller;

import nl.inholland.school.model.Topic;
import nl.inholland.school.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class TopicController {

    @Autowired
    private TopicService topicService;

    @GetMapping("/topics")
    public List<Topic> getAllTopics(){
        return  topicService.getTopics();
    }

    @GetMapping("/topics/{id}")
    public ResponseEntity<Topic> getTopicById(@PathVariable(value = "id") String topicId){
        Topic topic = topicService.getTopic(topicId);
        return ResponseEntity.ok().body(topic);
    }

    @DeleteMapping("/topic/delete/{id}")
    public void deleteTopic(@PathVariable(value = "id") String topicId) {
        topicService.deleteTopic(topicId);
    }

    @PostMapping("/newTopic")
    public Map<String, Boolean> addTopic(@RequestBody Topic topic) {
        topicService.addTopic(topic);
        Map<String, Boolean> response = new HashMap<>();
        response.put( topic.getId() + " " +  topic.getName() + " is added", Boolean.TRUE);
        return response;
    }

    @PostMapping("/updateTopic/{id}")
    public Map<String, Boolean> updateTopic(@RequestBody Topic topic) {
        topicService.updateTopic(topic);
        Map<String, Boolean> response = new HashMap<>();
        response.put( topic.getId() + " " +  topic.getName() + " is updated", Boolean.TRUE);
        return response;
    }
}
