package tourismmanagement;

import java.awt.*;
import java.sql.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.border.EmptyBorder;

public class ViewCustomers extends JFrame implements ActionListener{
    ViewCustomers(String username){
                setLayout(null);
		setBounds(200, 15, 900, 680);

               
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
                contentPane.setBackground(Color.WHITE);
		contentPane.setLayout(null);
                
                ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("icons/viewall.jpg"));
                Image i3 = i1.getImage().getScaledInstance(626, 201,Image.SCALE_DEFAULT);
                ImageIcon i2 = new ImageIcon(i3);
                JLabel l1 = new JLabel(i2);
                l1.setBounds(0,450,626,201);
                add(l1);
                
                ImageIcon i4  = new ImageIcon(ClassLoader.getSystemResource("icons/viewall.jpg"));
                Image i5 = i4.getImage().getScaledInstance(626, 201,Image.SCALE_DEFAULT);
                ImageIcon i6 = new ImageIcon(i5);
                JLabel l2 = new JLabel(i6);
                l2.setBounds(615,450,626,201);
                add(l2);
                
                JLabel lblusername = new JLabel("Username :");
                lblusername.setBounds(30,50,150,18);
                lblusername.setFont(new Font("Arial Black",Font.BOLD,18));
                add(lblusername);
                
                JLabel lusername = new JLabel();
                lusername.setBounds(180,50,150,18);
                lusername.setFont(new Font("Arial Black",Font.BOLD,18));
                add(lusername);
                
                JLabel id = new JLabel("Id :");
                id.setBounds(30,120,150,18);
                id.setFont(new Font("Arial Black",Font.BOLD,18));
                add(id);
                
                JLabel idlab = new JLabel();
                idlab.setBounds(180,120,150,18);
                idlab.setFont(new Font("Arial Black",Font.BOLD,18));
                add(idlab);

                
                JLabel no = new JLabel("Number :");
                no.setBounds(30,190,150,18);
                no.setFont(new Font("Arial Black",Font.BOLD,18));
                add(no);
                
                JLabel nol = new JLabel();
                nol.setBounds(180,190,150,18);
                nol.setFont(new Font("Arial Black",Font.BOLD,18));
                add(nol);
                
                
                JLabel name = new JLabel("Name :");
                name.setBounds(30,260,150,18);
                name.setFont(new Font("Arial Black",Font.BOLD,18));
                add(name);
                
                JLabel namelab = new JLabel();
                namelab.setBounds(180,260,250,18);
                namelab.setFont(new Font("Arial Black",Font.BOLD,18));
                add(namelab);
                
                
                JLabel Gender = new JLabel("Gender :");
                Gender.setBounds(30,330,150,18);
                Gender.setFont(new Font("Arial Black",Font.BOLD,18));
                add(Gender);
                
                JLabel Genderlab = new JLabel();
                Genderlab.setBounds(180,330,150,18);
                Genderlab.setFont(new Font("Arial Black",Font.BOLD,18));
                add(Genderlab);
                
                
                JLabel Country = new JLabel("Country :");
                Country.setBounds(500,50,150,19);
                Country.setFont(new Font("Arial Black",Font.BOLD,18));
                add(Country);
                
                JLabel Countrylab = new JLabel();
                Countrylab.setBounds(600,50,150,19);
                Countrylab.setFont(new Font("Arial Black",Font.BOLD,18));
                add(Countrylab);
                setVisible(true);
                
                JLabel Address = new JLabel("Address :");
                Address.setBounds(500,120,150,18);
                Address.setFont(new Font("Arial Black",Font.BOLD,18));
                add(Address);
                
                JLabel Addresslab = new JLabel();
                Addresslab.setBounds(600,120,150,19);
                Addresslab.setFont(new Font("Arial Black",Font.BOLD,18));
                add(Addresslab);
                setVisible(true);
                
                JLabel Phone = new JLabel("Phone :");
                Phone.setBounds(500,190,150,18);
                Phone.setFont(new Font("Arial Black",Font.BOLD,18));
                add(Phone);
                
                JLabel Phonelab = new JLabel();
                Phonelab.setBounds(580,190,150,22);
                Phonelab.setFont(new Font("Arial Black",Font.BOLD,18));
                add(Phonelab);
                setVisible(true);
                
                JLabel Email = new JLabel("Email :");
                Email.setBounds(500,260,150,18);
                Email.setFont(new Font("Arial Black",Font.BOLD,18));
                add(Email);
                
                JLabel Emaillab = new JLabel();
                Emaillab.setBounds(580,260,290,22);
                Emaillab.setFont(new Font("Arial Black",Font.BOLD,18));
                add(Emaillab);
                
                JButton back = new JButton("Back");
//                back.setFont(new Font("Arial Black",Font.BOLD,30));
                back.setBackground(Color.BLACK);
                back.setForeground(Color.WHITE);
                back.setBounds(360,420,120,25);
                back.addActionListener(this);
                add(back);
                try{
                    Conn conn = new Conn();
                    String query = "Select * from customer where username = '"+username+"'";
                    ResultSet rs = conn.s.executeQuery(query);
                    while(rs.next()){
                        lusername.setText(rs.getString("username"));
                        idlab.setText(rs.getString("id"));
                        nol.setText(rs.getString("number"));
                        namelab.setText(rs.getString("name"));
                        Genderlab.setText(rs.getString("gender"));
                        Countrylab.setText(rs.getString("country"));
                        Addresslab.setText(rs.getString("address"));
                        Phonelab.setText(rs.getString("phone"));
                        Emaillab.setText(rs.getString("emails"));                        
                    }
                    
                    }catch(Exception e){
                        System.out.println(e);
                    }
                    setVisible(true);
                    setUndecorated(true);              
                }
                public void actionPerformed(ActionEvent ae){
                        setVisible(false);
                }
                public static void main(String args[]){
                    new ViewCustomers("daisy");
                }
    }
}