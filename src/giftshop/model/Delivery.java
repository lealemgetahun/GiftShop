package giftshop.model;

public class Delivery {
     String message;
    public Delivery (String message){
        this.message = message;
    }
     String deliver(){
         return message;
     }
    Boolean CheckDelivery(boolean recived){
         return recived;
    }
}
