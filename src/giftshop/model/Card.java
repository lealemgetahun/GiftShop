package giftshop.model;
public class Card {
    String message;
    public Card(String message){
        this.message = message;
    }
    public String CardMessage(){
        return this.message;
    }
}