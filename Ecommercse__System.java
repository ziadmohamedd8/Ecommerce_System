/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecommercesystem;

/**
 *
 * @author Ziad
 */

import java.util.TimerTask;
   import javax.swing.*;

public class Ecommercse__System extends javax.swing.JFrame {

    // Declare GUI components
    private JButton add_pro_btn;
    private JComboBox<String> productComboBox;
    private JButton place_ord_btn;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JPanel jPanel1;
    private JScrollPane jScrollPane1;
    private JScrollPane jScrollPane2;
    private JScrollPane jScrollPane3;
    private JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private JTextArea adress;
    private JTextArea id;
    private JTextArea n_Products;
    private JTextArea name;
    private int addCounter = 0;
    private javax.swing.JTextArea jTextArea1;

    // Other variable declarations...
    private ElectronicProduct p1;
    private ClothingProduct p2;
    private BookProduct p3;
    private Customer c;
    private Cart cart;
    private Order o;

    public Ecommercse__System(ElectronicProduct p1, ClothingProduct p2, BookProduct p3, Customer c, Cart cart, Order o) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.c = c;
        this.cart = cart;
        this.o = o;
        
        initComponents(p1,p2,p3,c,cart,o);
             
        
        addListeners(p1,p2,p3,c,cart,o);
        setInitialValues();
    }

  private void initComponents(ElectronicProduct p1, ClothingProduct p2, BookProduct p3, Customer c, Cart cart, Order o) {

jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        productComboBox = new javax.swing.JComboBox<>();
        add_pro_btn = new javax.swing.JButton();
        place_ord_btn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        name = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        id = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        n_Products = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        adress = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("ID :");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Name :");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Adress :");

        jLabel5.setText(" how many products would you like to add ?");

        jLabel4.setText("Select Product :");
 productComboBox.addItem(p1.getName());
        productComboBox.addItem(p2.getName());
        productComboBox.addItem(p3.getName());
        

        add_pro_btn.setText("Add product");
        

        place_ord_btn.setText("place order");
       

        name.setColumns(20);
        name.setRows(1);
        jScrollPane1.setViewportView(name);

        id.setColumns(20);
        id.setRows(1);
        jScrollPane2.setViewportView(id);

        n_Products.setColumns(20);
        n_Products.setRows(1);
        jScrollPane3.setViewportView(n_Products);

        adress.setColumns(20);
        adress.setRows(1);
        jScrollPane4.setViewportView(adress);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(productComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(add_pro_btn)
                                .addComponent(place_ord_btn)))))
                .addContainerGap(281, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(productComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(add_pro_btn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(place_ord_btn)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane5.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();



    }

    private void addListeners(ElectronicProduct p1, ClothingProduct p2, BookProduct p3, Customer c, Cart cart, Order o) {
        
        add_pro_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
             if(addCounter==0){
               c.cart.setnProducts(Integer.parseInt(n_Products.getText()));
                c.setCustomerid(Integer.parseInt(id.getText()));}
                if (addCounter < c.getCart().getnProducts()) {
                    int choice = productComboBox.getSelectedIndex() + 1;
                    if (choice == 1) {
                        c.cart.addProduct(p1);
                    } else if (choice == 2) {
                        c.cart.addProduct(p2);
                    } else if (choice == 3) {
                        c.cart.addProduct(p3);
                    }
                    addCounter++;

                    // If the counter reaches the limit, disable the button
                    if (addCounter == c.getCart().getnProducts()) {
                        add_pro_btn.setEnabled(false);
                    }
                }
            }
        });
      
        place_ord_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
        c.o.printOrderInfo(c.getCustomerid(), c.cart.getnProducts(), c.cart.products,jTextArea1);

                  java.util.Timer timer = new java.util.Timer();
      timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.exit(0);
            }
        }, 10000); // 10000 millisec
//               System.exit(20);
            }
        });
    
    }
    private void setInitialValues() {
        id.setText(String.valueOf(c.getCustomerid()));
        name.setText(c.getName());
        adress.setText(c.getAdress());
        n_Products.setText("0"); // Set default value for n_Products
    }


}
              
    
    
    
    
    

   
                                               

 



