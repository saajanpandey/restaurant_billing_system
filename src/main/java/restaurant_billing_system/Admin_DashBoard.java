/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant_billing_system;

/**
 *
 * @author Saajan
 */
public class Admin_DashBoard extends javax.swing.JFrame {

    /**
     * Creates new form Admin_DashBoard
     */
    public Admin_DashBoard() {
        initComponents();
        setTitle("Admin DashBoard");
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
        add_product = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        sales_report = new javax.swing.JButton();
        change_password = new javax.swing.JButton();
        add_waiter = new javax.swing.JButton();
        categories = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        add_product.setText("Food Items");
        add_product.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_productActionPerformed(evt);
            }
        });

        logout.setText("Logout");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        sales_report.setText("Sales Report");
        sales_report.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sales_reportActionPerformed(evt);
            }
        });

        change_password.setText("Change Password");
        change_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                change_passwordActionPerformed(evt);
            }
        });

        add_waiter.setText("Waiter");
        add_waiter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_waiterActionPerformed(evt);
            }
        });

        categories.setText("Food Categories");
        categories.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoriesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(add_product)
                .addGap(22, 22, 22)
                .addComponent(categories)
                .addGap(18, 18, 18)
                .addComponent(sales_report)
                .addGap(36, 36, 36)
                .addComponent(add_waiter)
                .addGap(36, 36, 36)
                .addComponent(change_password)
                .addGap(36, 36, 36)
                .addComponent(logout)
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add_product)
                    .addComponent(logout)
                    .addComponent(sales_report)
                    .addComponent(change_password)
                    .addComponent(add_waiter)
                    .addComponent(categories))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 372, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Login_Form log = new Login_Form();
        log.setVisible(true);
    }//GEN-LAST:event_logoutActionPerformed

    private void sales_reportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sales_reportActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sales_reportActionPerformed

    private void change_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_change_passwordActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Change_Password cp =new Change_Password();
        cp.setVisible(true);
    }//GEN-LAST:event_change_passwordActionPerformed

    private void add_waiterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_waiterActionPerformed
        // TODO add your handling code here:
        Waiter w = new Waiter();
        w.setVisible(true);
    }//GEN-LAST:event_add_waiterActionPerformed

    private void add_productActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_productActionPerformed
        // TODO add your handling code here:
        FoodItems add = new FoodItems();
        add.setVisible(true);
    }//GEN-LAST:event_add_productActionPerformed

    private void categoriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoriesActionPerformed
        // TODO add your handling code here:
        Categories cg = new Categories();
        cg.setVisible(true);
    }//GEN-LAST:event_categoriesActionPerformed

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
            java.util.logging.Logger.getLogger(Admin_DashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_DashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_DashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_DashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_DashBoard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_product;
    private javax.swing.JButton add_waiter;
    private javax.swing.JButton categories;
    private javax.swing.JButton change_password;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton logout;
    private javax.swing.JButton sales_report;
    // End of variables declaration//GEN-END:variables
}
