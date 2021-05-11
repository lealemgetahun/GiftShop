package giftshop.model;

public class Drink {
    String name;

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public Double getPrice() {
        return price;
    }

    public String getSize() {
        return size;
    }

    String type;
    Double price;
    String size;
    public Drink(String name,String type,Double price,String size){
        this.name=name;
        this.type = type;
        this.price=price;
        this.size=size;
    }
}
