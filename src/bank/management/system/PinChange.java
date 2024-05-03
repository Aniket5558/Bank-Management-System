
package bank.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class PinChange extends  JFrame implements ActionListener  {
    
    JPasswordField pintext,repintext;
    JLabel text,pin,repin;
    JButton change,back;
    String pinnumber;
    
    PinChange(String pinnumber)
    {
        
        this.pinnumber = pinnumber;
        
      setLayout(null);  
      

    ImageIcon i1 = new ImageIcon (ClassLoader.getSystemResource("icons/atm.jpg"));
    Image i2 = i1.getImage().getScaledInstance(780,770,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new  JLabel(i3);
        image.setBounds(0, 0, 800, 800);
        add(image);
        
        text = new  JLabel("CHANGE YOUR PIN");
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System",Font.BOLD , 14));
        text.setBounds(235, 275, 400, 14);
        image.add(text);
        
        pin = new  JLabel("New PIN");
        pin.setForeground(Color.WHITE);
        pin.setFont(new Font("System",Font.BOLD , 15));
        pin.setBounds(145, 340, 400, 14);
        image.add(pin);
        
        pintext= new JPasswordField();
        pintext.setFont(new Font("Relaway",Font.BOLD , 15));
        pintext.setBounds(350, 340, 100, 20);
        image.add(pintext);
        
        
        
        repin = new  JLabel("Re-Enter New PIN");
        repin.setForeground(Color.WHITE);
        repin.setFont(new Font("System",Font.BOLD , 15));
        repin.setBounds(145, 380, 400, 14);
        image.add(repin);
        
        repintext= new JPasswordField();
        repintext.setFont(new Font("Relaway",Font.BOLD , 15));
        repintext.setBounds(350, 380, 100, 20);
        image.add(repintext);
        
        change = new JButton("Change");
        change.setBounds(335, 430, 120, 25);
        change.addActionListener(this);
        image.add(change);
        
        back = new JButton("Back");
        back.setBounds(335, 459, 120, 25);
        back.addActionListener(this);
        image.add(back);
        
        
    setSize(800,850);
    setLocation (300 , 0);
    setUndecorated(true);
    setVisible(true);
    
    }
   public void  actionPerformed(ActionEvent ae)
    {
        if (ae.getSource() == change )
        {
           try{
                 String npin = new String(pintext.getPassword());
                 String rpin =new String (repintext.getPassword()); 
                  
                 if(!npin.equals(rpin))
                 {
                   JOptionPane.showMessageDialog(null,"Please Enter PIN Is does not match");
                   return;
                 }
                 if (npin.equals(""))
                 {
                  JOptionPane.showMessageDialog(null,"Please Enter PIN");
                  return;
                 }
                 if(rpin.equals(""))
                 {
                  JOptionPane.showMessageDialog(null,"Please re-Enter PIN");
                  return;
                 }
               
                         Conn conn =new Conn();
                       String query1= "update bank set pinnumber = '"+rpin+"' where pinnumber='"+pinnumber+"' ";
                       String query2= "update login set pinnumber = '"+rpin+"' where pinnumber='"+pinnumber+"' ";
                       String query3= "update signupthree set pinnumber = '"+rpin+"' where pinnumber='"+pinnumber+"' ";

                       conn.s.executeUpdate(query1);
                       conn.s.executeUpdate(query2); 
                       conn.s.executeUpdate(query3);
               
               
               JOptionPane.showMessageDialog(null,"PIN Change Sucessfully");
               setVisible(false);
                new Transcctions(rpin).setVisible(true);

              }
        
           catch(Exception e)
          {
            System.out.println(e);
          }
     }
        else
        {
        setVisible(false);
        new Transcctions(pinnumber).setVisible(true);
        }
    }
    
    public static void main(String [] args)
    {
    new PinChange("").setVisible(true);
    }
}
