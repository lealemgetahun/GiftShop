package giftshop.model;

public class User {
    String fullname;
    String address;
    String phone;
    String email;
    String password;

    public User(String fullname, String address, String phone, String email,String password) {
        this.fullname = fullname;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.password=password;
    }

    public String getFullname() {
        return fullname;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }
    public String getPassword(){
        return password;
    }
}
