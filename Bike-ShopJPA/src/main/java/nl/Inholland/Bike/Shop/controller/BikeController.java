package nl.Inholland.Bike.Shop.controller;


import nl.Inholland.Bike.Shop.model.Bike;
import nl.Inholland.Bike.Shop.service.BikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class BikeController {

    @Autowired
    private BikeService bikeService;

    @GetMapping("/bikes")
    public List<Bike> getAllbikes(){
        return  bikeService.getBikes();
    }

    @GetMapping("/bikes/{id}")
    public ResponseEntity<Bike> getBikeById(@PathVariable(value = "id") String bikeId){

        Bike bike = bikeService.getBike(bikeId);
        return ResponseEntity.ok().body(bike);
    }

    @DeleteMapping("/bike/delete/{id}")
    public void deleteBike(@PathVariable(value = "id") String bikeId) {
        bikeService.deleteBike(bikeId);
    }

    @PostMapping("/newBike")
    public Map<String, Boolean> addBike(@RequestBody Bike bike) {
        bikeService.addBike(bike);
        Map<String, Boolean> response = new HashMap<>();
        response.put( bike.getBrand() + " " +  bike.getModel() + " is added", Boolean.TRUE);
        return response;
    }

    @PostMapping("/updateBike/{id}")
    public Map<String, Boolean> updateBike(@RequestBody Bike bike, @PathVariable(value = "id") String bikeId) {
        bikeService.updateBike(bikeId,bike);
        Map<String, Boolean> response = new HashMap<>();
        response.put( bike.getBrand() + " " +  bike.getModel() + " is updated", Boolean.TRUE);
        return response;
    }


}
