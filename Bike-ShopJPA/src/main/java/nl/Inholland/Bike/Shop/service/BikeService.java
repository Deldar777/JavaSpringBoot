package nl.Inholland.Bike.Shop.service;


import nl.Inholland.Bike.Shop.model.Bike;
import nl.Inholland.Bike.Shop.repository.BikeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Service
public class BikeService {

    @Autowired
    private BikeRepository bikeRepository;

    public List<Bike> getBikes(){
        List<Bike> bikes  = new ArrayList<>();
        bikeRepository.findAll().forEach(bikes::add);
        return bikes;
    }

    public Bike getBike(String id){
        return bikeRepository.findById(id).orElse(null);
    }

    public void addBike(Bike bike){
        bikeRepository.save(bike);
    }

    public void updateBike(Bike bike){
       bikeRepository.save(bike);
    }

    public void deleteBike(String id){
        bikeRepository.deleteById(id);
    }
}

