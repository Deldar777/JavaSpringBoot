package nl.inholland.school.repository;

import nl.inholland.school.model.Topic;
import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic,String> {}
