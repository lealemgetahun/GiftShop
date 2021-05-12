package giftshop.model.flowers;


import giftshop.model.Card;
import giftshop.model.Delivery;

public class Iris implements FlowerItem {
    @Override
    public String color() {
        return "purple";
    }

    @Override
    public String flowerName() {
        return "Iris";
    }

    @Override
    public Delivery deliver(String message) {
        return new Delivery(message);
    }

    @Override
    public Card cardMessage(String message) {
        return new Card(message);
    }

    @Override
    public float price() {
        return 67;
    }
}
