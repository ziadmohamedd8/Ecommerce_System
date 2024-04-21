/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecommercesystem;

/**
 *
 * @author Ziad
 */
public class Cart   {
   
    int nProducts;
    Product products[] ;
    int productnum=0;
    




    public int getnProducts() {
        return nProducts;
    }

    public void setnProducts(int nProducts) {
        this.nProducts = Math.abs(nProducts);
        products=new Product[nProducts];
    }

public void addProduct(Product p){

products[productnum]=p;

productnum++;
}   
    
 public void removeProduct(String productName) {
        boolean found = false;
        int indexToRemove = -1;

        // Find the index of the product with the given name
        for (int i = 0; i < productnum; i++) {
            if (products[i].getName().equals(productName)) {
                found =true;
                indexToRemove = i;
                break;
            }

if (found) {
            for (int j = indexToRemove; j < productnum - 1; j++) {
                products[j] = products[j + 1];
            }
            // Set the last element to null to avoid memory leaks
            products[productnum - 1] = null;
            productnum--;
            System.out.println("Product '" + productName + "' removed successfully.");
        } else {
            System.out.println("Product '" + productName + "' not found.");
        }
            
   }
 
 }

 public float calculatePrice(Product p){
 
 return p.getPrice();
 
 }
 
 
 
 
}
 