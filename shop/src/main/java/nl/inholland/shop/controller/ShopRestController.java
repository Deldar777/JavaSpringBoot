package nl.inholland.shop.controller;

import nl.inholland.shop.model.Motorcycle;
import nl.inholland.shop.service.MotorcycleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ShopRestController {

    @Autowired
    private MotorcycleService shopService;

    @GetMapping("/bikes")
    public List<Motorcycle> getAllMotorcycles(){
        return  shopService.getMotorcycles();
    }
}
