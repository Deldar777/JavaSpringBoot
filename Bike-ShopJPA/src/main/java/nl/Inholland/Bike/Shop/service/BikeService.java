package nl.Inholland.Bike.Shop.service;


import nl.Inholland.Bike.Shop.model.Bike;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;


@Service
public class BikeService {


    private List<Bike> bikes  = new ArrayList<>(Arrays.asList(
            new Bike("1","Fazer","Yamaha",5000),
            new Bike("2","Nc","Yamaha",6000),
            new Bike("3","SV650","Suzuki",5500)
    ));


    public List<Bike> getBikes(){
        return bikes;
    }

    public Bike getBike(String id){
        return bikes.stream().filter(bike -> bike.getId().equals(id)).findFirst().get();
    }

    public void addBike(Bike bike){
        bikes.add(bike);
    }

    public void updateBike(String id, Bike bike){
        for (int i = 0; i < bikes.size(); i++){
            Bike b = bikes.get(i);
            if(b.getId().equals(id)){
                bikes.set(i,bike);
                return;
            }
        }
    }

    public void deleteBike(String id){
        bikes.removeIf(bike -> bike.getId().equals(id));
    }


}

