package tourismmanagement;

import javax.swing.*;
import java.awt.*;


public class Main extends JFrame implements Runnable{
    Thread thread;
    Main(){
//        setSize(1000,600);
//        setLocation(60,55);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/splash.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1100,600,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image =  new JLabel(i3);
        add(image);
        setVisible(true);
        thread = new Thread(this);
        thread.start();
    }
    public void run(){
        try{
            Thread.sleep(7000);
            setVisible(false);
            Login x= new Login();
        }catch(Exception e){
            
        }
                
    }
    public static void main(String[] args) {
        Main m=new Main(); 
        int x=1;
        for(int i=1;i<=500;x+=7,i+=6){
            m.setLocation(650-(x+i)/2,300 -(i/2));
            m.setSize(x+i,i);
            try{
                Thread.sleep(10);
            }
            catch(Exception e){ }
        }         
    }
}
 