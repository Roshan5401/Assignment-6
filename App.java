import java.util.*;
import java.io.*;

import models.*;
public class App {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        //map for the customer and their cart
        HashMap<Customer,Cart> cust_cart=new HashMap<>();

        //map for product name and its object
        HashMap<String,Product> name_prod=new HashMap<>();
        
        Product p1=new Product("Shaving gel","Gillete",50,20);
        Product p2=new Product("Soap","Lux",35,15);
        Product p3=new Product("Shirt","Raymonds",5000,5);
        Product p4=new Product("Shoe","Nike",2000,25);
        Product p5=new Product("Bag","Safari",2500,12);
        
        name_prod.put("shaving gel",p1);
        name_prod.put("soap",p2);
        name_prod.put("shirt",p3);
        name_prod.put("shoe",p4);
        name_prod.put("bag",p5);
        
        Customer c1=new Customer("Roshan","roshansingh.ns@gmail.com",905151, "12345678",name_prod);
        



        

    }

}