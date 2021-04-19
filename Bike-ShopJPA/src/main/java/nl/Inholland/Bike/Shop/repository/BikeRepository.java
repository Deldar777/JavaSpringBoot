package nl.Inholland.Bike.Shop.repository;

import nl.Inholland.Bike.Shop.model.Bike;
import org.springframework.data.repository.CrudRepository;

public interface BikeRepository extends CrudRepository<Bike,String> {}
