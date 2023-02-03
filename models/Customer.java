package models;
public class Customer
{
    public String name;
    public String email;
    public long phone;
    Cart customer_cart;
    private String password;
    public Customer()
    {
        this.name="";
        this.email="";
        this.phone=0;
        customer_cart=new Cart();
    }
    public Customer(String name, String email,long phone)
    {
        this.name=name;
        this.email=email;
        this.phone=phone;
        customer_cart=new Cart();
    }
    

}