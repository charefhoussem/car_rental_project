
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class login extends javax.swing.JFrame {

  
     Connection con;
    public login() {
        initComponents();
        try {
           
             con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root", "");
        } catch (SQLException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        id = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        customer = new javax.swing.JRadioButton();
        admin = new javax.swing.JRadioButton();
        login = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        sign_in = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1200, 700));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(null);

        id.setText("enter your id ");
        jPanel1.add(id);
        id.setBounds(110, 10, 160, 30);

        password.setText("jPasswordField1");
        jPanel1.add(password);
        password.setBounds(110, 70, 160, 30);

        buttonGroup1.add(customer);
        customer.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        customer.setText("customer");
        customer.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        customer.setOpaque(false);
        customer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerActionPerformed(evt);
            }
        });
        jPanel1.add(customer);
        customer.setBounds(30, 130, 100, 27);

        buttonGroup1.add(admin);
        admin.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        admin.setText("administartor");
        admin.setOpaque(false);
        jPanel1.add(admin);
        admin.setBounds(180, 130, 119, 27);

        login.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-login-24.png"))); // NOI18N
        login.setText("LOGIN");
        login.setBorderPainted(false);
        login.setOpaque(false);
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        jPanel1.add(login);
        login.setBounds(90, 170, 140, 33);

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-user-60.png"))); // NOI18N
        jLabel3.setText("ID");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 10, 60, 50);

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-password-52.png"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(20, 60, 52, 60);

        sign_in.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        sign_in.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-signin-24.png"))); // NOI18N
        sign_in.setText("SIGN IN");
        sign_in.setOpaque(false);
        sign_in.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sign_inActionPerformed(evt);
            }
        });
        jPanel1.add(sign_in);
        sign_in.setBounds(100, 240, 140, 33);

        jLabel5.setFont(new java.awt.Font("Verdana", 3, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 51, 51));
        jLabel5.setText("you don't have an account?");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(10, 210, 216, 18);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(200, 310, 310, 290);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Welcome to Car Rental Agency.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 1200, 710);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void customerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_customerActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        // TODO add your handling code here:
        test_input input = new test_input();
        String user = id.getText();
        String mdp = new String(password.getPassword());
        int test_id;
        String pw = "";
        int count = 0;
        int test=0;

        if (admin.isSelected()) {
            test = input.id_integrality_test(user);
            int id = 0;

            if (test == 1) {
                id = Integer.parseInt(user);
            }

            try {

                Statement stmt = con.createStatement();
                String SQL1 = "SELECT COUNT(*) AS count FROM ADMINISTRATOR WHERE ADMIN_ID=" + id;
                ResultSet rs1 = stmt.executeQuery(SQL1);
                while (rs1.next()) {
                    count = rs1.getInt("count");

                }
                if (count == 0) {JOptionPane.showMessageDialog(null, "There is no registred Administrator with this ID");}
                else {
                    String SQL = "SELECT * FROM ADMINISTRATOR WHERE ADMIN_ID=" + id;
                    ResultSet rs = stmt.executeQuery(SQL);
                    while (rs.next()) {
                        test_id = rs.getInt("ADMIN_ID");
                        pw = rs.getString("PASSWORD");
                    }
                    if (pw.equals(mdp)) {
                        new administrator().setVisible(true);
                        this.setVisible(false);
                        Current_User User = new Current_User(id,"administrator");
                    } else {
                        JOptionPane.showMessageDialog(null, "Your password is wrong");
                    }
                }

            } catch (SQLException ex) {
                Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else if (customer.isSelected()) {
            try {
                test = input.id_integrality_test(user);
                int id = 0;

                if (test == 1) {
                    id = Integer.parseInt(user);

                }

                Statement stmt = con.createStatement();
                String SQL1 = "SELECT COUNT(*) AS count FROM CUSTOMER WHERE CUSTOMER_ID=" + id;
                ResultSet rs1 = stmt.executeQuery(SQL1);
                if (rs1.next()) {
                    count = rs1.getInt("count");

                }
                if (count == 0) {JOptionPane.showMessageDialog(null, "There is no customer With this ID");}
                else {
                    String SQL = "SELECT * FROM CUSTOMER WHERE CUSTOMER_ID=" + id;
                    ResultSet rs = stmt.executeQuery(SQL);
                    while (rs.next()) {
                        test_id = rs.getInt("CUSTOMER_ID");
                        pw = rs.getString("PASSWORD");
                    }
                    if (pw.equals(mdp)) {
                        new customer().setVisible(true);
                        this.setVisible(false);
                        Current_User User = new Current_User(id,"customer");
                    } else {
                        JOptionPane.showMessageDialog(null, "Your password is wrong");}

                }

            } catch (SQLException ex) {
                Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
            }
        }         else {
            new alert().setVisible(true);

        }
    }//GEN-LAST:event_loginActionPerformed

    private void sign_inActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sign_inActionPerformed
        // TODO add your handling code here:
               this.setVisible(false);
        new sign_in().setVisible(true);
    }//GEN-LAST:event_sign_inActionPerformed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton admin;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton customer;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton login;
    private javax.swing.JPasswordField password;
    private javax.swing.JButton sign_in;
    // End of variables declaration//GEN-END:variables
}
