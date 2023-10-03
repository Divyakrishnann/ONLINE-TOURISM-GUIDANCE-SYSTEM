package tourismmanagement;
import javax.swing.*;

public class Login1 extends JFrame {

    public Login1() {
        initComponents();
        setSize(680,470);
        setVisible(true);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        frampan = new javax.swing.JPanel();
        userlabel = new javax.swing.JLabel();
        passlabel = new javax.swing.JLabel();
        usrinp = new javax.swing.JTextField();
        paswdinp = new javax.swing.JPasswordField();
        Login = new javax.swing.JButton();
        Signup = new javax.swing.JButton();
        forgetpswd = new javax.swing.JButton();
        bck = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        frampan.setPreferredSize(new java.awt.Dimension(713, 543));
        frampan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        userlabel.setBackground(new java.awt.Color(0, 153, 153));
        userlabel.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        userlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userlabel.setText("Username");
        userlabel.setOpaque(true);
        frampan.add(userlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, 230, 40));

        passlabel.setBackground(new java.awt.Color(0, 153, 153));
        passlabel.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        passlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        passlabel.setText("Password");
        passlabel.setOpaque(true);
        frampan.add(passlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 190, 230, 46));

        usrinp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usrinpActionPerformed(evt);
            }
        });
        frampan.add(usrinp, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, 230, 40));

        paswdinp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paswdinpActionPerformed(evt);
            }
        });
        frampan.add(paswdinp, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 250, 230, 50));

        Login.setBackground(new java.awt.Color(0, 153, 153));
        Login.setFont(new java.awt.Font("Arial Black", 1, 13)); // NOI18N
        Login.setForeground(java.awt.Color.white);
        Login.setText("Login ");
        Login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Login.setVerifyInputWhenFocusTarget(false);
        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });
        frampan.add(Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, 140, 40));

        Signup.setBackground(new java.awt.Color(0, 153, 153));
        Signup.setFont(new java.awt.Font("Arial Black", 1, 13)); // NOI18N
        Signup.setForeground(java.awt.Color.white);
        Signup.setText("Signup");
        Signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignupActionPerformed(evt);
            }
        });
        frampan.add(Signup, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 350, 120, 50));

        forgetpswd.setBackground(new java.awt.Color(0, 153, 153));
        forgetpswd.setFont(new java.awt.Font("Arial Black", 1, 13)); // NOI18N
        forgetpswd.setForeground(java.awt.Color.white);
        forgetpswd.setText("Forgot Password");
        forgetpswd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        forgetpswd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forgetpswdActionPerformed(evt);
            }
        });
        frampan.add(forgetpswd, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 170, 40));

        bck.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/bck.jpg"))); // NOI18N
        frampan.add(bck, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 430));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(frampan, javax.swing.GroupLayout.PREFERRED_SIZE, 796, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(frampan, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void usrinpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usrinpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usrinpActionPerformed

    private void paswdinpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paswdinpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_paswdinpActionPerformed

    private void SignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SignupActionPerformed

    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LoginActionPerformed

    private void forgetpswdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forgetpswdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_forgetpswdActionPerformed

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
            java.util.logging.Logger.getLogger(Login1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Login;
    private javax.swing.JButton Signup;
    private javax.swing.JLabel bck;
    private javax.swing.JButton forgetpswd;
    private javax.swing.JPanel frampan;
    private javax.swing.JLabel passlabel;
    private javax.swing.JPasswordField paswdinp;
    private javax.swing.JLabel userlabel;
    private javax.swing.JTextField usrinp;
    // End of variables declaration//GEN-END:variables
}
