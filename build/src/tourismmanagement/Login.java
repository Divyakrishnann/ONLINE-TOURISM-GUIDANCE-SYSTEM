package tourismmanagement;
import javax.swing.*;
import java.sql.*;

public class Login extends JFrame {

    public Login() {
        initComponents();
        setSize(680,470);
        setVisible(true);
    }
                     
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
        frampan.add(usrinp, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, 230, 40));       
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
    }                        

    private void SignupActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
            setVisible(false);
            Signup su = new Signup();
            su.setVisible(true);
    }                                      

    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {
                Boolean status = false;
		try {
                    Conn con = new Conn();
                    String sql = "select * from account where username=? and password=?";
                    PreparedStatement st = con.c.prepareStatement(sql);

                    st.setString(1, usrinp.getText());
                    st.setString(2, paswdinp.getText());
                    ResultSet rs = st.executeQuery();
                    if ( usrinp.getText().equals("") || paswdinp.getText().equals("") ){
                        JOptionPane.showMessageDialog(null, "Enter the valid details!");
                    }
                    else{
                        if (rs.next()) {
                            this.setVisible(false);
                            new Loading(usrinp.getText()).setVisible(true);
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "Invalid Login or Password!");
                        } 
                    }
                       
		} catch (Exception e2) {
                    e2.printStackTrace();
		}
            
    }                                     

    private void forgetpswdActionPerformed(java.awt.event.ActionEvent evt) {                                           
         setVisible(false);
        ForgotPassword forgot = new ForgotPassword();
        forgot.setVisible(true);
    }
        
  	public static void main(String[] args) {
                new Login().setVisible(true);
	}                    
    private javax.swing.JButton Login,Signup,forgetpswd; 
    private javax.swing.JLabel bck,passlabel,userlabel;
    private javax.swing.JPanel frampan; 
    private javax.swing.JPasswordField paswdinp;
    private javax.swing.JTextField usrinp;
                      
}
