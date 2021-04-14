package nl.inholland.shop.service;

import nl.inholland.shop.model.Motorcycle;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@Service
public class MotorcycleService {

    private List<Motorcycle> motorcycles;

    public MotorcycleService(List<Motorcycle> motorcycles){
        this.motorcycles = Arrays.asList(
                new Motorcycle(1,"Fazer","Yamaha",5000),
                new Motorcycle(1,"Nc","Yamaha",6000),
                new Motorcycle(1,"SV650","Suzuki",5500)
        );
    }

    public List<Motorcycle> getMotorcycles(){
        return this.motorcycles;
    }
}
