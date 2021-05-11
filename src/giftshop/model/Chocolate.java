package giftshop.model;

public class Chocolate {
    String brand;
    String type;
    String size;
    Double price;

    public Chocolate(String brand, String type, String size, Double price) {
        this.brand = brand;
        this.type = type;
        this.size = size;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public String getType() {
        return type;
    }

    public String getSize() {
        return size;
    }

    public Double getPrice() {
        return price;
    }
}
