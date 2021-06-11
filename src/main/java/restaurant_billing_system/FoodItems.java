/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant_billing_system;
import javax.swing.*;
import java.sql.*;
import javax.swing.table.TableModel;
import javax.swing.text.*;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Saajan
 */
public class FoodItems extends javax.swing.JFrame {

    /**
     * Creates new form Add_FoodItems
     */
    public FoodItems() {
        initComponents();
        price.setDocument(new JTextFieldLimit(4));
//      Fillcombo();
        refreshTable();
        refreshTable1();
        setTitle("Food Items");
        
       
      
    }
    //limiting the JTextField
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
  //Refresh food_jTable
  private void refreshTable(){
           try{
               Class.forName("com.mysql.cj.jdbc.Driver");
                   
                   Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rbs","root","");
                   
                   PreparedStatement ps = con.prepareStatement
                ("Select food.id,food.name,food.price,category.name from food,category WHERE category.id=food.category_id");
                   ResultSet rs = ps.executeQuery();
                   
                   food_jTable.setModel(DbUtils.resultSetToTableModel(rs));
                   food_jTable.getColumnModel().getColumn(0).setHeaderValue("ID");
                   food_jTable.getColumnModel().getColumn(1).setHeaderValue("Food Name");
                   food_jTable.getColumnModel().getColumn(2).setHeaderValue("Price");
                   food_jTable.getColumnModel().getColumn(3).setHeaderValue("Category Name");
                  
           }
           catch(Exception e)
           {
              
           }
      }
  private void refreshTable1(){
           try{
               Class.forName("com.mysql.cj.jdbc.Driver");
                   
                   Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rbs","root","");
                   
                   PreparedStatement ps = con.prepareStatement("Select * from category");
                   ResultSet rs = ps.executeQuery();
                   category_jTable.setModel(DbUtils.resultSetToTableModel(rs));
                   category_jTable.getColumnModel().getColumn(0).setHeaderValue("ID");
                   category_jTable.getColumnModel().getColumn(1).setHeaderValue("Category Name");
           }
           catch(Exception e)
           {
              
           }
      }
 
  //Fill ComboBox category
  
//  private void Fillcombo(){
//      
//      try{
//          Class.forName("com.mysql.cj.jdbc.Driver");
//                   
//          Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rbs","root","");
//          
//          PreparedStatement ps = con.prepareStatement("Select id,name from category ");
//          
//          ResultSet rs = ps.executeQuery();
//          
//          while(rs.next())
//          {
//            
//              String name = rs.getString("name");
//               
//              category.addItem(name);
//          }   
//          
//      }
//      catch(Exception e )
//      {
//          JOptionPane.showMessageDialog(null,"Content not available");
//      }
//          
//  }
  
  
        
    
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
        name = new javax.swing.JTextField();
        price = new javax.swing.JTextField();
        insert = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        food_jTable = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        delete = new javax.swing.JButton();
        update = new javax.swing.JButton();
        category = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        category_jTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Food Items", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        jLabel1.setText("Food Name");

        jLabel2.setText("Price");

        insert.setText("Add");
        insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertActionPerformed(evt);
            }
        });

        cancel.setText("Cancel");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        jLabel3.setText("ID");

        id.setEditable(false);

        food_jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Price", "Category Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        food_jTable.setShowGrid(false);
        food_jTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                food_jTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(food_jTable);
        if (food_jTable.getColumnModel().getColumnCount() > 0) {
            food_jTable.getColumnModel().getColumn(0).setHeaderValue("ID");
            food_jTable.getColumnModel().getColumn(1).setHeaderValue("Name");
            food_jTable.getColumnModel().getColumn(2).setHeaderValue("Price");
            food_jTable.getColumnModel().getColumn(3).setHeaderValue("Category Name");
        }

        jLabel4.setText("Category ID");

        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Category"));

        category_jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Category Name"
            }
        ));
        jScrollPane2.setViewportView(category_jTable);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 629, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(93, 93, 93)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(name, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                                    .addComponent(price)
                                    .addComponent(id)
                                    .addComponent(category))
                                .addGap(60, 60, 60))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(insert, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(update)
                                .addGap(38, 38, 38)
                                .addComponent(delete)
                                .addGap(40, 40, 40)))
                        .addComponent(cancel)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(23, 23, 23)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(48, 48, 48))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(category, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(insert)
                            .addComponent(cancel)
                            .addComponent(delete)
                            .addComponent(update)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        // TODO add your handling code here:
        this.dispose();
     
    }//GEN-LAST:event_cancelActionPerformed

    private void insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertActionPerformed
        // TODO add your handling code here:
       try{
         
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rbs","root","");
        
        PreparedStatement ps = con.prepareStatement("INSERT INTO food(name, price,category_id) VALUES (?,?,?)");
        
        ps.setString(1,name.getText());
        int price1 = Integer.parseInt(price.getText());
        ps.setInt(2,price1);
//       Integer value= Integer.parseInt(category.getSelectedItem().toString());
//        ps.setInt(3,);
        int cat1 = Integer.parseInt(category.getText());
        ps.setInt(3,cat1);
        ps.executeUpdate();
       
        JOptionPane.showMessageDialog(null,"Food Item Registered");
          name.setText("");
          price.setText("");
          category.setText("");
         
       }
        
       catch(Exception e)
       {
           JOptionPane.showMessageDialog(null,"Food Item Not Registered","Alert",JOptionPane.WARNING_MESSAGE);
           name.setText("");
           price.setText("");
           category.setText("");
       }
        refreshTable();
    }//GEN-LAST:event_insertActionPerformed

    private void food_jTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_food_jTableMouseClicked
        // TODO add your handling code here:
        int i= food_jTable.getSelectedRow();
        TableModel model = food_jTable.getModel();
        id.setText(model.getValueAt(i,0).toString());
        name.setText(model.getValueAt(i,1).toString());
        price.setText(model.getValueAt(i,2).toString());
//        category.setSelectedItem(model.getValueAt(i,3).toString())
//        category.setText(model.getValueAt(i,3).toString());
    }//GEN-LAST:event_food_jTableMouseClicked

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rbs","root","");
            
            PreparedStatement ps = con.prepareStatement("Delete from food where id=?");
            
            
            ps.setString(1,id.getText());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"Food Item  Deleted");
            name.setText("");
            price.setText("");
            id.setText("");
            category.setText("");
//           category.setSelectedItem("Please Select A Category");
           
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Record Not Updated","Alert",JOptionPane.WARNING_MESSAGE);
        }
        refreshTable();
    }//GEN-LAST:event_deleteActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rbs","root","");
            
            PreparedStatement ps = con.prepareStatement("UPDATE food set name=?, price=?, category_id=? where id=? ");
            
            ps.setString(1,name.getText());
            int price2 = Integer.parseInt(price.getText());
            ps.setInt(2,price2);
////            String value = category.getSelectedItem().toString();
////            ps.setString(3, value);
            int cat1 = Integer.parseInt(category.getText());
            ps.setInt(3,cat1);
             
            ps.setString(4,id.getText());
            
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"Food Item  Updated");
            name.setText("");
            price.setText("");
            id.setText("");
            category.setText("");   
           
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Record Not Updated","Alert",JOptionPane.WARNING_MESSAGE);
        }
        refreshTable();
    }//GEN-LAST:event_updateActionPerformed

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
            java.util.logging.Logger.getLogger(FoodItems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FoodItems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FoodItems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FoodItems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FoodItems().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel;
    private javax.swing.JTextField category;
    private javax.swing.JTable category_jTable;
    private javax.swing.JButton delete;
    private javax.swing.JTable food_jTable;
    private javax.swing.JTextField id;
    private javax.swing.JButton insert;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField name;
    private javax.swing.JTextField price;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
