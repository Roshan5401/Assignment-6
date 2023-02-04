package models;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

import javax.lang.model.util.ElementScanner14;

public class Cart
{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    //cart variable
    private HashMap<Product,Integer> mp=new HashMap<>();


    public Cart(HashMap<String, Product> hm)throws IOException
    {
        System.out.println("Cart Empty Now, Enjoy Shopping");
        System.out.println("");
        while(true)
        {
            System.out.println("Enter your choice accordingly:");
            System.out.println("1: Add item");
            System.out.println("2: Remove item");
            System.out.println("3: Display all items in cart");
            System.out.println("4: Total amount");
            System.out.println("5: Exit");

            int ch=Integer.parseInt(br.readLine());
            switch(ch)
            {
                case 1:additem(hm);
                        break;
                case 2:removeitem(hm);
                        break;
                case 3:displayall();
                        break;
                case 4:total();
                        break;
                case 5:System.exit(1);
                        break;
                default:System.out.println("Invalid Choice");
                        break;
            }
        }
    }
    void total()
    {
        long total_amount=0;
        for (Entry<Product,Integer> entry : mp.entrySet()) {
            total_amount+=entry.getValue()*(entry.getKey().price);
        }
        System.out.println("Total amount: "+ total_amount);
    }
    void displayall()
    {
        if(mp.size()==0)
        {
            System.out.println("Cart Empty");
            return;
        }
        System.out.println("Items present in cart");
        for (Entry<Product,Integer> entry : mp.entrySet()) {
                System.out.println(entry.getKey().name + "----->" + entry.getValue());
        }
        System.out.println();
    }
    private void removeitem(HashMap<String, Product> hm) throws IOException {
        System.out.println("Items present in cart");
        for (Entry<Product,Integer> entry : mp.entrySet()) {
                System.out.println(entry.getKey().name + "----->" + entry.getValue());
        }
        
        boolean f=true;
        while(true)
        {
            System.out.println("Enter the name of the product to be removed");
            System.out.println("Enter 'no' to stop removing");
            String ch="";
            ch=br.readLine();
            int n;
            switch(ch)
            {
                case "soap":System.out.println("Enter the quantity to be removed");
                            n=Integer.parseInt(br.readLine());
                            if(n<=mp.get(hm.get("soap"))){
                                int x=mp.get(hm.get("soap"))-n;
                                mp.put(hm.get("soap"),x);
                                x=hm.get("soap").quantity+n;
                                
                                Product p=hm.get("soap");
                                p.quantity=x;
                            }
                            else {
                                System.out.println("Not Possible");
                            }
                            break;
                
                case "shirt":System.out.println("Enter the quantity to be removed");
                            n=Integer.parseInt(br.readLine());
                            if(n<=mp.get(hm.get("shirt"))){
                                int x=mp.get(hm.get("shirt"))-n;
                                mp.put(hm.get("shirt"),x);
                                x=hm.get("shirt").quantity+n;

                                Product p=hm.get("shirt");
                                p.quantity=x;
                            }
                            else {
                                System.out.println("Not Possible");
                            }
                            break;

                
                case "shoe":System.out.println("Enter the quantity to be removed");
                            n=Integer.parseInt(br.readLine());
                            if(n<=mp.get(hm.get("shoe"))){
                                int x=mp.get(hm.get("shoe"))-n;
                                mp.put(hm.get("shoe"),x);
                                
                                x=hm.get("shoe").quantity+n;

                                Product p=hm.get("shoe");
                                p.quantity=x;
                            }
                            else {
                                System.out.println("Not Possible");
                            }
                            break;
                
                
                case "bag":System.out.println("Enter the quantity to be removed");
                            n=Integer.parseInt(br.readLine());
                            if(n<=mp.get(hm.get("bag"))){
                                int x=mp.get(hm.get("bag"))-n;
                                mp.put(hm.get("bag"),x);
                                
                                x=hm.get("bag").quantity+n;

                                Product p=hm.get("bag");
                                p.quantity=x;
                            }
                            else {
                                System.out.println("Not Possible");
                            }
                            break;

                
                case "shaving gel":System.out.println("Enter the quantity to be removed");
                            n=Integer.parseInt(br.readLine());
                            if(n<=mp.get(hm.get("shaving gel"))){
                                int x=mp.get(hm.get("shaving gel"))-n;
                                mp.put(hm.get("shaving gel"),x);
                                
                                x=hm.get("shaving gel").quantity+n;

                                Product p=hm.get("shaving gel");
                                p.quantity=x;
                            }
                            else {
                                System.out.println("Not Possible");
                            }
                            break;
                case "no":f=false;
                            break;
                default:System.out.println("Irrelivant item");
                            break;
            }
            if(f==false)
                break;
        }
    }
    private void additem(HashMap<String, Product> hm)throws IOException
    {
        System.out.println();
        System.out.println("Items Present In Mall");
         for (Entry<String, Product> entry : hm.entrySet()) {
            if(entry.getValue().quantity==0)
                System.out.println(entry.getKey() + "----->" + "Out Of Stock");
            else {
                entry.getValue();
                System.out.println("Name: "+entry.getKey() + "\tQuantity: " + entry.getValue().quantity + "\tPrice: "+ entry.getValue().price);
            }
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
                    int k=hm.get(name).quantity-n;
                    Product hey=hm.get(name);
                    hey.quantity=k;
                    
                }
                System.out.println("Item added in cart\n");
            }
        }
    }
}
