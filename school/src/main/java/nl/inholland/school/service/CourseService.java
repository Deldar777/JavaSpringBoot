package nl.inholland.school.service;

import nl.inholland.school.model.Course;
import nl.inholland.school.model.Topic;
import nl.inholland.school.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public Course getCourse(String topicId){
        return courseRepository.findByTopicId(topicId);
    }

    public List<Course> getCourses(){
        List<Course> courses  = new ArrayList<>();
        courseRepository.findAll().forEach(courses::add);
        return courses;
    }

    public void addCourse(Course course){
        courseRepository.save(course);
    }

    public void updateCourse(Course course){
        courseRepository.save(course);
    }

    public void deleteCourse(String id){
        courseRepository.deleteById(id);
    }
}
