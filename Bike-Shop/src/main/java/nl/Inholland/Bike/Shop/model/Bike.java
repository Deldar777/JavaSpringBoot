package nl.Inholland.Bike.Shop.model;

import javax.persistence.Entity;
import javax.persistence.Id;

public class Bike {

    private String id;
    private String model;
    private String brand;
    private double price;

    public Bike(String id, String model, String brand, double price) {
        super();
        this.id = id;
        this.model = model;
        this.brand = brand;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
