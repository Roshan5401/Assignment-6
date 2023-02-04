package models;

import java.io.IOException;
import java.util.HashMap;

public class Customer
{
    public String name;
    public String email;
    public long phone;
    public Cart customer_cart;
    private String password;
    public Customer()
    {
        this.name="";
        this.email="";
        this.phone=0;
    }
    public Customer(String name, String email,long phone,String password,HashMap<String,Product> hm) throws IOException
    {
        this.name=name;
        this.email=email;
        this.phone=phone;
        customer_cart=new Cart(hm);
        this.password=password;
        
    }
    

}