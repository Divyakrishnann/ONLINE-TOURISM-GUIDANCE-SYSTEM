package tourismmanagement;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.sql.*;
import java.awt.event.*;

public class ForgotPassword extends JFrame implements ActionListener{

    private JPanel contentPane;
    private JTextField t1,t2,t3,t4,t5;
    private JButton b1,b2,b3;

    public static void main(String[] args) {
	new ForgotPassword().setVisible(true);
    }

    public ForgotPassword() {

        setBounds(240, 120, 850, 400);
	contentPane = new JPanel();
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	setContentPane(contentPane);
        contentPane.setBackground(Color.BLACK);
	contentPane.setLayout(null);

	JLabel l1 = new JLabel("Username");
        l1.setForeground(Color.WHITE);
	l1.setFont(new Font("Tahoma", Font.BOLD, 15));
	l1.setBounds(109, 83, 87, 29);
	contentPane.add(l1);

	JLabel l2 = new JLabel("Name");
        l2.setForeground(Color.WHITE);
	l2.setFont(new Font("Tahoma", Font.BOLD, 15));
	l2.setBounds(109, 122, 75, 21);
	contentPane.add(l2);

	JLabel l3 = new JLabel("Your Security Question");
        l3.setForeground(Color.WHITE);
	l3.setFont(new Font("Tahoma", Font.BOLD, 15));
	l3.setBounds(109, 154, 200, 27);
	contentPane.add(l3);

	JLabel l4 = new JLabel("Answer");
        l4.setForeground(Color.WHITE);
	l4.setFont(new Font("Tahoma", Font.BOLD, 15));
	l4.setBounds(109, 192, 104, 21);
	contentPane.add(l4);

	JLabel l5 = new JLabel("Password");
        l5.setForeground(Color.WHITE);
	l5.setFont(new Font("Tahoma", Font.BOLD, 15));
	l5.setBounds(109, 224, 104, 21);
	contentPane.add(l5);

	t1 = new JTextField();
	t1.setFont(new Font("Tahoma", Font.BOLD, 10));
	t1.setForeground(new Color(0,0,0));
	t1.setBounds(300, 88, 139, 20);
	contentPane.add(t1);
	t1.setColumns(10);

	t2 = new JTextField();
	t2.setEditable(false);
	t2.setFont(new Font("Tahoma", Font.BOLD, 10));
	t2.setForeground(new Color(0,0,0));
	t2.setColumns(10);
	t2.setBounds(300, 123, 139, 20);
	contentPane.add(t2);

        t3 = new JTextField();
	t3.setEditable(false);
	t3.setFont(new Font("Tahoma", Font.BOLD, 10));
	t3.setForeground(new Color(0,0,0));
	t3.setColumns(10);
	t3.setBounds(300, 161, 245, 20);
	contentPane.add(t3);
	

	t4 = new JTextField();
	t4.setFont(new Font("Tahoma", Font.BOLD, 10));
	t4.setForeground(new Color(0,0,0));
	t4.setColumns(10);
	t4.setBounds(300, 193, 139, 20);
	contentPane.add(t4);

	t5 = new JTextField();
	t5.setEditable(false);
	t5.setFont(new Font("Tahoma", Font.BOLD, 10));
	t5.setForeground(new Color(0,0,0));
	t5.setColumns(10);
	t5.setBounds(300, 225, 139, 20);
	contentPane.add(t5);
        
        ImageIcon c1 = new ImageIcon(ClassLoader.getSystemResource("icons/forgotpassword.jpg"));
        Image i1 = c1.getImage().getScaledInstance(235, 250,Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i1);
        
        JLabel l6 = new JLabel(i2);
        l6.setBounds(500, 0, 400, 380);
        add(l6);

	b1 = new JButton("Search");
	b1.addActionListener(this);
	b1.setFont(new Font("Tahoma", Font.BOLD, 12));
	b1.setBounds(460, 87, 85, 22);
	b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        contentPane.add(b1);

	b2 = new JButton("Retrieve");
	b2.addActionListener(this);
	b2.setFont(new Font("Tahoma", Font.BOLD, 12));
	b2.setBounds(460,193, 85, 22);
	b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
	contentPane.add(b2);

	b3 = new JButton("Back");
	b3.addActionListener(this);
	b3.setFont(new Font("Tahoma", Font.BOLD, 13));
	b3.setBounds(220, 290, 85, 29);
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
	contentPane.add(b3);

	JPanel panel = new JPanel();
	panel.setBounds(47, 45, 508, 291);
        panel.setBackground(new Color(0,102,153));
	contentPane.add(panel);
        this.setUndecorated(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        try{
            Conn con = new Conn();
            if(ae.getSource() == b1){
                String sql = "select * from account where username=?";
		PreparedStatement st = con.c.prepareStatement(sql);
                if(t1.getText().equals("")){
                      JOptionPane.showMessageDialog(null, "Please enter your username");
                }
                else{st.setString(1, t1.getText());
                    ResultSet rs = st.executeQuery();
                    if (rs.next()) {
                        t2.setText(rs.getString("name"));
                        t3.setText(rs.getString("security"));
                    }
                    else{
                               JOptionPane.showMessageDialog(null, "Incorrect Username");
                    }
                }
            }
            if(ae.getSource() == b2){
                String sql = "select * from account where answer=?";
		PreparedStatement st = con.c.prepareStatement(sql);
                
                if(t4.getText().equals("")){
                      JOptionPane.showMessageDialog(null, "Please enter the answer");
                }
                else{
                    st.setString(1, t4.getText());
                    ResultSet rs = st.executeQuery();

                    if (rs.next()) {
                            t5.setText(rs.getString("password"));
                    }
                    else{
                         JOptionPane.showMessageDialog(null, "Wrong Answer");
                    }
                }
            }
            if(ae.getSource() == b3){
                this.setVisible(false);
		new Login().setVisible(true);
			
            }
        }catch(Exception e){
            
        }
    }

}