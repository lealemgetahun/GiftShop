package giftshop.model;

public class Flower {
    String name;

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public Double getPrice() {
        return price;
    }

    String color;
    Double price;
    public Flower(String name,String color,Double price){
        this.name = name;
        this.color = color;
        this.price = price;
    }


}
