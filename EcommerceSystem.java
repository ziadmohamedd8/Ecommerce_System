/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ecommercesystem;

/**
 *
 * @author Ziad
 */



public class EcommerceSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       

ElectronicProduct p1=new ElectronicProduct();
p1.setName("smartphone");
p1.setBrand("samsung");
p1.setPrice(599.9f);
p1.setProductid(1);
p1.setWarrantyPeriod(1);
        
 ClothingProduct p2=new ClothingProduct();
 p2.setName("T-shirt");
 p2.setFabric("cotton");
 p2.setPrice(19.99f);
 p2.setProductid(2);
 p2.setSize("medium");
    
 BookProduct p3=new BookProduct();
 p3.setName("OOP");
 p3.setAuthor("O'Reilly");
 p3.setProductid(3);
 p3.setPrice(39.99f);
 p3.setPublisher("X publication");
  

     Customer c=new Customer();

    c.setCart();
    c.setO();

   
      java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ecommercse__System(p1, p2, p3, c, c.getCart(),c.getO()).setVisible(true);
            }
        });
 
    
      

    }
}
