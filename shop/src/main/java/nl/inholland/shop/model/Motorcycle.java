package nl.inholland.shop.model;

public class Motorcycle {

    private long id;
    private String model;
    private String brand;
    private double price;

    public Motorcycle(long id, String model, String brand, double price) {
        this.id = id;
        this.model = model;
        this.brand = brand;
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
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
