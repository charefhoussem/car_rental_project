import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;



public class customer extends javax.swing.JFrame {

Connection con;
    public customer() {
        initComponents();
            try {
            //con = DriverManager.getConnection("jdbc:derby://localhost:1527/project", "java", "java");
             con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root", "");
        } catch (SQLException ex) { 
          Logger.getLogger(customer.class.getName()).log(Level.SEVERE, null, ex);
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

        about_us = new javax.swing.JButton();
        rent = new javax.swing.JButton();
        cars = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        customer_rental = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 400));
        getContentPane().setLayout(null);

        about_us.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        about_us.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-about-30.png"))); // NOI18N
        about_us.setText("About Us");
        about_us.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                about_usActionPerformed(evt);
            }
        });
        getContentPane().add(about_us);
        about_us.setBounds(60, 100, 160, 39);

        rent.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        rent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-car-rental-30.png"))); // NOI18N
        rent.setText("Rent A Car");
        rent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rentActionPerformed(evt);
            }
        });
        getContentPane().add(rent);
        rent.setBounds(50, 30, 180, 39);

        cars.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        cars.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-car-30.png"))); // NOI18N
        cars.setText("See Our Cars");
        cars.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carsActionPerformed(evt);
            }
        });
        getContentPane().add(cars);
        cars.setBounds(290, 30, 200, 39);

        cancel.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-cancel-30.png"))); // NOI18N
        cancel.setText("Cancel A Rent ");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        getContentPane().add(cancel);
        cancel.setBounds(550, 30, 220, 39);

        logout.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-logout-rounded-down-26.png"))); // NOI18N
        logout.setText("Logout");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        getContentPane().add(logout);
        logout.setBounds(540, 100, 140, 35);

        customer_rental.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        customer_rental.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-car-rental-30.png"))); // NOI18N
        customer_rental.setText("your rentals ");
        customer_rental.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customer_rentalActionPerformed(evt);
            }
        });
        getContentPane().add(customer_rental);
        customer_rental.setBounds(280, 100, 210, 39);

        jLabel3.setFont(new java.awt.Font("Pristina", 3, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("welcome to your interface");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 320, 440, 44);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/three-cars-showroom-white-59005737.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 810, 380);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
 this.setVisible(false);
 new login().setVisible(true);
    }//GEN-LAST:event_logoutActionPerformed

    private void about_usActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_about_usActionPerformed
        // TODO add your handling code here:
  this.setVisible(false);
 new about_us().setVisible(true);
    }//GEN-LAST:event_about_usActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        // TODO add your handling code here:
   this.setVisible(false);
 new cancel_rent().setVisible(true);
    }//GEN-LAST:event_cancelActionPerformed

    private void carsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carsActionPerformed
        // TODO add your handling code here:
 see_cars Frame= new see_cars();
 Frame.setVisible(true);
    }//GEN-LAST:event_carsActionPerformed

    private void rentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rentActionPerformed
        // TODO add your handling code here:
 this.setVisible(false);
 new rent_car().setVisible(true);
    }//GEN-LAST:event_rentActionPerformed

    private void customer_rentalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customer_rentalActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
 new customer_rentals().setVisible(true);
    }//GEN-LAST:event_customer_rentalActionPerformed

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
            java.util.logging.Logger.getLogger(customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new customer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton about_us;
    private javax.swing.JButton cancel;
    private javax.swing.JButton cars;
    private javax.swing.JButton customer_rental;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton logout;
    private javax.swing.JButton rent;
    // End of variables declaration//GEN-END:variables
}