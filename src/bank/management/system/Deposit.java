
package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;


public class Deposit extends JFrame implements ActionListener{
    JTextField amount;
    JButton deposit,back;
    String pinnumber;
    
    Deposit(String pinnumber)
    {
         this.pinnumber = pinnumber;
        setLayout(null);
       
        ImageIcon i1 = new ImageIcon (ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(750,800,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new  JLabel(i3);
        image.setBounds(0, 0, 765, 780);
        add(image);
        
        JLabel text = new  JLabel("Enter the amount want to deposit");
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System",Font.BOLD , 14));
        text.setBounds(160, 255, 400, 14);
        image.add(text);
        
        amount= new JTextField();
        amount.setFont(new Font("Relaway",Font.BOLD , 17));
        amount.setBounds(160, 300, 250, 27);
        image.add(amount);
        
        deposit = new JButton("Deposit");
        deposit.setBounds(300, 423, 130, 25);
        deposit.addActionListener(this);
        image.add(deposit);
        
        back = new JButton("Back");
        back.setBounds(300, 453, 130, 25);
        back.addActionListener(this);
        image.add(back);
        
        setSize(780,850);
        setLocation(280,0);
        setVisible(true);
    
    }
    
    public void  actionPerformed(ActionEvent ae)
      {
          if (ae.getSource() == deposit)
          {
           String number = amount.getText(); 
           Date date= new Date(); 
           if(number.equals(""))
            {
              JOptionPane.showMessageDialog(null,"Enter the amount  you want  to deposit");
            }
           else 
           {
               Conn conn = new Conn();
               try{
             
             String query ="insert into bank values('"+pinnumber+"','"+date+"','Deposit','"+number+"')"; 
             conn.s.executeUpdate(query);
             JOptionPane.showMessageDialog(null,"Rs"+number+"/- Deposited Successfully");
              setVisible(false);
              new Transcctions(pinnumber).setVisible(true);
               }
               catch (Exception e){
               System.out.println(e);
               }finally{
                   conn.closeConnection();
               }
               }
          }
          else if (ae.getSource() == back)
          {
              setVisible(false);
           new Transcctions(pinnumber).setVisible(true);
          }
      }
    public static void main(String[] args)
    {
     new Deposit("");
    }
}