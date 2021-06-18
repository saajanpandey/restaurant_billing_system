/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant_billing_system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;
import net.proteanit.sql.DbUtils;


/**
 *
 * @author Saajan
 */
public class Take_Order extends javax.swing.JFrame {

    /**
     * Creates new form Take_Order
     */
    public Take_Order() {
        initComponents();
        c_contact.setDocument(new JTextFieldLimit(10));
        //billHeader();
        refreshTable1();
          Object [] colomns={"Food Items","Quantity","Price","Total"};
  DefaultTableModel model= new DefaultTableModel();
  model.setColumnIdentifiers(colomns);
  bill_jTable.setModel(model);
  
    }
    
//    private void billHeader()
//{
//       int total;
//
//bill.setText("========================"+"\n"
//            +"Restaurant Name"+"\n"
//    +"Contact No-xxxxxxxxx"+"\n"
//    +"Adress-xxxxxxx"+"\n"
//    +"========================"+"\n"+
//     "Food Name"+ "\t"+"Quantity"+"\t"+"Price"+"\t"+"Total"+"\n"
//        
//);
//}
    private void refreshTable1(){
           try{
               Class.forName("com.mysql.cj.jdbc.Driver");
                   
                   Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rbs","root","");
                   
                   PreparedStatement ps = con.prepareStatement("Select food.name,food.price,category.name from food,category WHERE category.id=food.category_id");
                   ResultSet rs = ps.executeQuery();
                   foodjTable.setModel(DbUtils.resultSetToTableModel(rs));
                   foodjTable.getColumnModel().getColumn(0).setHeaderValue("Food Name");
                   foodjTable.getColumnModel().getColumn(1).setHeaderValue("Price"); 
           }
           catch(Exception e)
           {
              
           }
      }
    
    
    class JTextFieldLimit extends PlainDocument {
  private int limit;
  JTextFieldLimit(int limit) {
    super();
    this.limit = limit;
  }
  JTextFieldLimit(int limit, boolean upper) {
    super();
    this.limit = limit;
  }
  @Override 
  public void insertString(int offset, String str, AttributeSet attr) throws BadLocationException {
    if (str == null)
      return;

    if ((getLength() + str.length()) <= limit) {
      super.insertString(offset, str, attr);
    }
  }
}

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        c_name = new javax.swing.JTextField();
        c_contact = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        quantity = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        foodjTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        bill = new javax.swing.JTextArea();
        Add_items = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        food_item = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        price = new javax.swing.JTextField();
        print_bill = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        grand_total = new javax.swing.JTextField();
        save = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        bill_jTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Order And Bill"));

        jLabel1.setText("Customer Name");

        jLabel2.setText("Contact");

        jLabel4.setText("Quantity");

        foodjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Food Item", "Price"
            }
        ));
        foodjTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                foodjTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(foodjTable);

        bill.setColumns(20);
        bill.setRows(5);
        jScrollPane2.setViewportView(bill);

        Add_items.setText("Add Items");
        Add_items.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_itemsActionPerformed(evt);
            }
        });

        jLabel3.setText("Food Items");

        jLabel5.setText("Price");

        print_bill.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        print_bill.setText("Print");
        print_bill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                print_billActionPerformed(evt);
            }
        });

        jLabel6.setText("Grand Total");

        grand_total.setEditable(false);

        save.setText("save");

        bill_jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        bill_jTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bill_jTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(bill_jTable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(grand_total, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(61, 61, 61))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(272, 272, 272)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17))
                            .addComponent(Add_items, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel6))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(food_item)
                                    .addComponent(c_name, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(c_contact, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(print_bill, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(131, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(318, 318, 318)
                    .addComponent(jLabel4)
                    .addGap(18, 18, 18)
                    .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(451, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(c_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c_contact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(food_item, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Add_items, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(grand_total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6))
                            .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(print_bill, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(73, 73, 73)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(389, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void print_billActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_print_billActionPerformed
         //TODO add your handling code here:
//                try{
//                        bill.setText(bill.getText()+
//                                    "=========================="+"\n"+"Grand Total"+"\t\t"+
//                              "\n"+"============================"+"\n"
//                    +"Customer Name:"+c_name.getText()+"\n"
//                            +"Contact number:"+c_contact.getText());
//            
//                        bill.print();
//                    }
//                catch(Exception e)
//                {
//                        JOptionPane.showMessageDialog(null,"Bill not printed","Alert",JOptionPane.WARNING_MESSAGE);
//                    }
    }//GEN-LAST:event_print_billActionPerformed

    private void Add_itemsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_itemsActionPerformed
        // TODO add your handling code here:

        int price1 = Integer.parseInt(price.getText());
        int quantity1 = Integer.parseInt(quantity.getText());
        int total = price1*quantity1;
        
        DefaultTableModel table = (DefaultTableModel) bill_jTable.getModel();
        Object [] row = new Object[4];
        row[0]=food_item.getText();
        row[1]=quantity.getText();
        row[2]=price.getText();
        row[3]=total;
        table.addRow(row);

//                bill.setText(
//            
//            
//                            bill.getText()+food_item.getText()+"\t"+quantity.getText()+"\t"+price.getText()+"\t"+total
//                                    +"\n"
//                          );

        //        String s = Integer.toString(sum);
        //       grand_total.setText(s);
        food_item.setText("");
        price.setText("");
        quantity.setText("");
    }//GEN-LAST:event_Add_itemsActionPerformed

    private void foodjTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_foodjTableMouseClicked
        // TODO add your handling code here:
        int i= foodjTable.getSelectedRow();
        TableModel model = foodjTable.getModel();
        food_item.setText(model.getValueAt(i,0).toString());
        price.setText(model.getValueAt(i,1).toString());
    }//GEN-LAST:event_foodjTableMouseClicked

    private void bill_jTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bill_jTableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel df1 = (DefaultTableModel) bill_jTable.getModel();
    int rs[] = bill_jTable.getSelectedRows();
    for (int i = rs.length-1; i >=0 ; i--) {

        int k = rs[i];

        df1.removeRow(k);
    }
    }//GEN-LAST:event_bill_jTableMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Take_Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Take_Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Take_Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Take_Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Take_Order().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add_items;
    private javax.swing.JTextArea bill;
    private javax.swing.JTable bill_jTable;
    private javax.swing.JTextField c_contact;
    private javax.swing.JTextField c_name;
    private javax.swing.JTextField food_item;
    private javax.swing.JTable foodjTable;
    private javax.swing.JTextField grand_total;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField price;
    private javax.swing.JButton print_bill;
    private javax.swing.JTextField quantity;
    private javax.swing.JButton save;
    // End of variables declaration//GEN-END:variables
}