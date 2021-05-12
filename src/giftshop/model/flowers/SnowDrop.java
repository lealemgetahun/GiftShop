package giftshop.model.flowers;
import giftshop.model.Card;
import giftshop.model.Delivery;

public class SnowDrop implements FlowerItem{


    @Override
    public String flowerName() {
        return "SnowDrop";
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
        return 78;
    }

    @Override
    public String color() {
        return "white";
    }

}
