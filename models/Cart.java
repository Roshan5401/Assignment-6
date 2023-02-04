package models;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public class Cart
{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    //cart variable
    HashMap<Product,Integer> mp=new HashMap<>();


    public Cart(HashMap<String, Product> hm)throws IOException
    {
        while(true)
        {
            System.out.println("Enter your choice accordingly:");
            System.out.println("1: Add item");
            System.out.println("2: Remove item");
            int ch=Integer.parseInt(br.readLine());
            switch(ch)
            {
                case 1:additem(hm);
                        break;
                case 2:removeitem(hm);
            }
            break;
        }
    }
    private void removeitem(HashMap<String, Product> hm) {
    }
    private void additem(HashMap<String, Product> hm)throws IOException
    {
        System.out.println();
        System.out.println("Items Present In Mall");
         for (Entry<String, Product> entry : hm.entrySet()) {
            if(entry.getValue().quantity==0)
                System.out.println(entry.getKey() + "----->" + "Out Of Stock");
            else
                System.out.println(entry.getKey() + "----->" + entry.getValue().quantity);
        }
        
        System.out.println("Enter the name of the product you want to purchase");
        String name=br.readLine();
        System.out.println("Enter the quantity you want to purchase");
        int n=Integer.parseInt(br.readLine());

        if(hm.containsKey(name.toLowerCase()))
        {
            Product p=hm.get(name.toLowerCase());
            if(p.quantity>=n)
            {
                if(mp.containsKey(p))
                {
                    int fetch_value=mp.get(p);
                    mp.put(p,fetch_value+n);
                }
                else
                {
                    mp.put(p,n);
                }
                System.out.println("Item added in cart");
            }
        }
    }
}
