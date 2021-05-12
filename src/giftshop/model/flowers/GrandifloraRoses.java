package giftshop.model.flowers;


import giftshop.model.Card;
import giftshop.model.Delivery;

public class GrandifloraRoses implements FlowerItem{

    @Override
    public String color() {
        return "Pink";
    }
    @Override
    public String flowerName() {
        return "Grandiflora Roses";
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
        return 56;
    }
}
