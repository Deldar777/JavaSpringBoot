package nl.inholland.school.repository;

import nl.inholland.school.model.Course;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CourseRepository extends CrudRepository<Course,String> {
    public Course findByTopicId(String topicId);
}
