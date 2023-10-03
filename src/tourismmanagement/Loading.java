package tourismmanagement;

import java.awt.*;
import javax.swing.*;
import java.sql.*;

public class Loading extends JFrame implements Runnable {

	private JPanel contentPane;
	private JProgressBar progressBar;
	Connection conn;
        String username;
	int s;
	Thread th;

	public static void main(String[] args) {
            new Loading("").setVisible(true);
	}

	public void setUploading() {
            setVisible(false);
            th.start();
	}

	public void run() {
            try {
                for (int i = 0; i < 200; i++) {
                    s = s + 1;
                    int m = progressBar.getMaximum();
                    int v = progressBar.getValue();
                    if (v < m) {
                        progressBar.setValue(progressBar.getValue() + 1);
                    } else {
                        i = 201;
                        setVisible(false);
                        new Home(username).setVisible(true);
                    }
                    Thread.sleep(50);
                }
            } catch (Exception e) {
		e.printStackTrace();
            }
	}

	public Loading(String username) {
            this.username = username;
            th = new Thread((Runnable) this);
            
            setBounds(310, 190, 600, 400);
            contentPane = new JPanel();
//            contentPane.setBackground(Color.BLUE);
            setContentPane(contentPane);
            contentPane.setLayout(null);

            JLabel lbllibraryManagement = new JLabel("ONLINE TOURISM GUIDANCE SYSTEM");
            lbllibraryManagement.setForeground(Color.white);
            lbllibraryManagement.setFont(new Font("Arial Black", Font.BOLD, 22));
            lbllibraryManagement.setBounds(50, 46, 700, 35);
            contentPane.add(lbllibraryManagement);
	
            progressBar = new JProgressBar();
            progressBar.setFont(new Font("Tahoma", Font.BOLD, 12));
            progressBar.setStringPainted(true);
            progressBar.setBounds(130, 135, 300, 25);
            contentPane.add(progressBar);

            JLabel lblNewLabel_2 = new JLabel("Please Wait....");
            lblNewLabel_2.setFont(new Font("Arial Black", Font.ITALIC, 20));
            lblNewLabel_2.setForeground(Color.white);
            lblNewLabel_2.setBounds(260, 165, 150, 20);
            contentPane.add(lblNewLabel_2);
            
            JLabel lblusername = new JLabel("Welcome "+username+" :)");
            lblusername.setBounds(20,310,400,40);
            lblusername.setForeground(Color.WHITE);
            lblusername.setFont(new Font("Arial Black",Font.ITALIC,25));
            add(lblusername);
            
            JPanel panel = new JPanel();
            panel.setBackground(Color.WHITE);
            panel.setBounds(10, 10, 580, 380);
            contentPane.add(panel);
            
            ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/load2.jpg"));
            Image i2 = i1.getImage().getScaledInstance(1100,600,Image.SCALE_DEFAULT);
            ImageIcon i3 = new ImageIcon(i2);
            JLabel image =  new JLabel(i3);
            panel.add(image);
              
            setUndecorated(true);
            setUploading();
	}
}