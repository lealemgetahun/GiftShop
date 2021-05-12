
package giftshop.model.flowers;

import giftshop.model.Card;
import giftshop.model.Delivery;

public interface FlowerItem {
    String flowerName();
    public Delivery deliver(String message);
    public Card cardMessage(String message);
    public float price();
    public String color();
}
