package giftshop.model;

public class Delivery {
     String deliveryDate;
    public Delivery (String date){
        this.deliveryDate = date;
    }
    String setDeliveryDate(){
         return deliveryDate;
     }
    Boolean CheckDelivery(boolean recived){
         return recived;
    }
}
