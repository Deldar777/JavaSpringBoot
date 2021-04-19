package nl.inholland.school.controller;

import nl.inholland.school.model.Course;
import nl.inholland.school.model.Topic;
import nl.inholland.school.service.CourseService;
import nl.inholland.school.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class CourseController {


    @Autowired
    private CourseService courseService;
    @Autowired
    private TopicService topicService;

    @GetMapping("/courses")
    public List<Course> getAllCourses(){
        return  courseService.getCourses();
    }

    @GetMapping("/courses/{id}")
    public ResponseEntity<Course> getCourseById(@PathVariable String id){
        Course course = courseService.getCourse(id);
        return ResponseEntity.ok().body(course);
    }

    @DeleteMapping("/courses/delete/{id}")
    public void deleteCourse(@PathVariable String id) {
        courseService.deleteCourse(id);
    }

    @PostMapping("/addCourse/{topicId}")
    public Map<String, Boolean> addCourse(@RequestBody Course course, @PathVariable String topicId) {
        Topic topic = topicService.getTopic(topicId);
        course.setTopic(topic);
        courseService.addCourse(course);
        Map<String, Boolean> response = new HashMap<>();
        response.put( course.getId() + " " +  course.getName() + " is added", Boolean.TRUE);
        return response;
    }

    @PostMapping("/courses/{id}")
    public Map<String, Boolean> updateCourse(@RequestBody Course course) {
        courseService.updateCourse(course);
        Map<String, Boolean> response = new HashMap<>();
        response.put( course.getId() + " " +  course.getName() + " is updated", Boolean.TRUE);
        return response;
    }
}
