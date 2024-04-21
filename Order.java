/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecommercesystem;

import javax.swing.JTextArea;

/**
 *
 * @author Ziad
 */
public class Order extends Cart {
 
  int orderid;
  float totalprice;

    public int getOrderid() {
        return orderid;
    }

    public void setOrderid(int orderid) {
        this.orderid = orderid;
    }


    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public int getProductnum() {
        return productnum;
    }

    public void setProductnum(int productnum) {
        this.productnum = productnum;
    }
  
public float calctotalprice(Product arr[],int nProducts){

for(int i=0; i<nProducts; i++){
totalprice+=arr[i].getPrice();

}
return totalprice;

}

  public float getTotalprice() {
        return totalprice;
    }
 
public void printOrderInfo(int customerid,int nProducts,Product arr[],JTextArea textArea ){
              StringBuilder sb = new StringBuilder();
   sb.append("Here 's your order summary \n");
    sb.append("Order Id: "+orderid+"\n Customer Id: "+customerid+"\n");
       sb.append("products: \n");
calctotalprice(arr,nProducts);

for(int i=0; i<nProducts; i++){
if(arr[i]!=null)
sb.append(arr[i].getName()).append(" - ").append(arr[i].getPrice()).append("\n");

}
sb.append("The total price is :"+getTotalprice());
  textArea.setText(sb.toString());
}}



