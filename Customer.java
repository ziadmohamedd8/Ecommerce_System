/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecommercesystem;

/**
 *
 * @author Ziad
 */
public class Customer {
    
    int customerid;
    String name,adress;
Cart cart ;
Order o;

    public Order getO() {
        return o;
    }

    public void setO() {
        this.o = new Order();
        o.orderid=1;
        
    }
 



    public int getCustomerid() {
        return customerid;
    }

    public void setCustomerid(int customerid) {
        this.customerid = Math.abs(customerid);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart() {
        this.cart =new Cart();
    }
    
    
    
}
