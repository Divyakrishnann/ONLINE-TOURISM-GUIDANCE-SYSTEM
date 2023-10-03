package tourismmanagement;
import javax.swing.*;
import java.sql.*;
public class Signup extends javax.swing.JFrame {

    public Signup() {
        initComponents();
        setVisible(true);
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        usrnme = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        paswd = new javax.swing.JLabel();
        sec = new javax.swing.JLabel();
        ans = new javax.swing.JLabel();
        usrinput = new javax.swing.JTextField();
        nameinput = new javax.swing.JTextField();
        ansinput = new javax.swing.JTextField();
        pswdinp = new javax.swing.JPasswordField();
        choiceinp = new java.awt.Choice();
        back = new javax.swing.JButton();
        create = new javax.swing.JButton();
        bck = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        usrnme.setBackground(new java.awt.Color(153, 255, 153));
        usrnme.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        usrnme.setForeground(new java.awt.Color(199, 251, 199));
        usrnme.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        usrnme.setText("Username :");
        usrnme.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(199, 251, 199)));
        usrnme.setFocusable(false);
        usrnme.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(usrnme, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, 33));

        name.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        name.setForeground(new java.awt.Color(199, 251, 199));
        name.setText("Name :");
        name.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(199, 251, 199)));
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 100, 30));

        paswd.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        paswd.setForeground(new java.awt.Color(199, 251, 199));
        paswd.setText("Password:");
        paswd.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(199, 251, 199)));
        getContentPane().add(paswd, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, 37));

        sec.setFont(new java.awt.Font("Arial Black", 1, 17)); // NOI18N
        sec.setForeground(new java.awt.Color(199, 251, 199));
        sec.setText("Security Question:");
        sec.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(199, 251, 199)));
        getContentPane().add(sec, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 190, 40));

        ans.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        ans.setForeground(new java.awt.Color(199, 251, 199));
        ans.setText("Answer:");
        ans.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(199, 251, 199)));
        getContentPane().add(ans, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 205, 100, 30));

        usrinput.setBackground(java.awt.Color.black);
        usrinput.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        usrinput.setForeground(new java.awt.Color(199, 251, 199));
        usrinput.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(199, 251, 199)));
        usrinput.setCaretColor(new java.awt.Color(199, 251, 199));
        usrinput.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        usrinput.setDisabledTextColor(new java.awt.Color(199, 251, 199));
        usrinput.setDoubleBuffered(true);
        getContentPane().add(usrinput, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 52, 320, 30));

        nameinput.setBackground(java.awt.Color.black);
        nameinput.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        nameinput.setForeground(new java.awt.Color(199, 251, 199));
        nameinput.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(199, 251, 199)));
        nameinput.setCaretColor(new java.awt.Color(199, 251, 199));
        nameinput.setDisabledTextColor(new java.awt.Color(199, 251, 199));
       
        getContentPane().add(nameinput, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 103, 320, 30));

        ansinput.setBackground(java.awt.Color.black);
        ansinput.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        ansinput.setForeground(new java.awt.Color(199, 251, 199));
        ansinput.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(199, 251, 199)));
        ansinput.setCaretColor(new java.awt.Color(199, 251, 199));
        ansinput.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        ansinput.setDisabledTextColor(new java.awt.Color(199, 251, 199));
        getContentPane().add(ansinput, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 320, 30));

        pswdinp.setBackground(java.awt.Color.black);
        pswdinp.setFont(new java.awt.Font("Arial Black", 1, 13)); // NOI18N
        pswdinp.setForeground(new java.awt.Color(199, 251, 199));
        pswdinp.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(199, 251, 199)));
        pswdinp.setCaretColor(new java.awt.Color(199, 251, 199));
        pswdinp.setDisabledTextColor(new java.awt.Color(199, 251, 199));
        getContentPane().add(pswdinp, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 252, 320, 30));

        choiceinp.setBackground(java.awt.Color.black);
        choiceinp.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        choiceinp.setForeground(new java.awt.Color(199, 251, 199));
        getContentPane().add(choiceinp, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 320, 60));
        choiceinp.add("Favourite character from The Vampire Diaries");
        choiceinp.add("Your Lucky Number");
        choiceinp.add("Favourite Marvel superhero");
        choiceinp.add("Favourite childhood superheroes");
        choiceinp.add("Favourite colour");

        back.setBackground(new java.awt.Color(199, 251, 199));
        back.setFont(new java.awt.Font("Arial Black", 1, 13)); // NOI18N
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 310, 107, 30));

        create.setBackground(new java.awt.Color(199, 251, 199));
        create.setFont(new java.awt.Font("Arial Black", 1, 13)); // NOI18N
        create.setText("Create");
        create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createActionPerformed(evt);
            }
        });
        getContentPane().add(create, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, 92, 30));

        bck.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/s.jpg"))); // NOI18N
        getContentPane().add(bck, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 360));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold> 
                                               
       private void createActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
          try{
                Conn con = new Conn();
                String sql = "insert into account(username, name, password, security, answer) values(?, ?, ?, ?, ?)";
		PreparedStatement st = con.c.prepareStatement(sql);
               
                if(usrinput.getText().equals("") || nameinput.getText().equals("") || pswdinp.getText().equals("") ||choiceinp.getSelectedItem().equals("") || ansinput.getText().equals("")){
                        JOptionPane.showMessageDialog(null,"Please enter all the details");
                }
                else{
                        st.setString(1, usrinput.getText());
                        st.setString(2, nameinput.getText());
                        st.setString(3, pswdinp.getText());
                        st.setString(4, (String) choiceinp.getSelectedItem());
                        st.setString(5, ansinput.getText());

                        int i = st.executeUpdate();
                        if (i > 0){
                            JOptionPane.showMessageDialog(null, "Account Created Successfully ");
                        }

                        usrinput.setText("");
                        nameinput.setText("");
                        pswdinp.setText("");
                        ansinput.setText("");     
                          setVisible(false);
                          new Login();
              }
        }
        catch(Exception e){
                System.out.println(e);
        }
//        setVisible(false);
//        new Login();
    }                                        

    private void nameinputActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    private void usrinputActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        
    private void backActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        
        setVisible(false);
        new Login();
        
    }                                    

    public static void main(String args[]) {
//                new Signup().setUndecorated(true);
                new Signup().setVisible(true);
            
    }
//    sec is security
               
    private JLabel ans,bck,name,sec,usrnme,paswd;
    private JTextField ansinput,nameinput,usrinput;
    private JButton back,create;
    private java.awt.Choice choiceinp;
    private JPasswordField pswdinp;


             
}
