
package bank.management.system;

import javax.swing.*;
import  java.awt.*;
import java.awt.event.*;

public class Transcctions extends  JFrame implements ActionListener {
       JButton deposit ,withdrawl,ministatement,pinchange,fastcash,balanceenquiry,exit;
       String pinnumber;
    
    
    Transcctions(String pinnumber)
    {
        this.pinnumber = pinnumber;
        setLayout(null);  
        
        ImageIcon i1 = new ImageIcon (ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(750,800,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new  JLabel(i3);
        image.setBounds(0, 0, 800, 850);
        add(image);
        
        JLabel text = new JLabel("Please Select Your Transaction ");
        text.setBounds(197, 295, 700, 20);
        text.setForeground(Color.WHITE);
        text.setFont(new Font ("system",Font.BOLD,14));
        image.add(text);
        
         deposit = new JButton("Deposit");
        deposit.setBounds(165, 395, 100, 27);
        deposit.addActionListener(this);
        image.add(deposit); 
        
         withdrawl = new JButton("Cash Withdrawl");
        withdrawl.setBounds(320, 395, 130, 27);
        withdrawl.addActionListener(this);
        image.add(withdrawl); 
        
        fastcash = new JButton("Fast Cash");
        fastcash.setBounds(165, 425, 100, 27);
        fastcash.addActionListener(this);
        image.add(fastcash); 
        
        ministatement = new JButton("Mini Statement");
        ministatement.setBounds(320, 425, 130, 27);
        ministatement.addActionListener(this);
        image.add(ministatement); 
        
        pinchange = new JButton("Pin Change");
        pinchange.setBounds(165, 455, 100, 27);
        pinchange.addActionListener(this);
        image.add(pinchange); 
        
        balanceenquiry = new JButton("Balance Enquiry");
        balanceenquiry.setBounds(320, 455, 130, 27);
        balanceenquiry.addActionListener(this);
        image.add(balanceenquiry); 
       
        
        exit = new JButton("Exit");
        exit.setBounds(320, 485, 130, 27);
        exit.addActionListener(this);
        image.add(exit); 
       
        
        
        
      setSize(800,850);
      setLocation (300 , 0);
      setUndecorated(true);
      setVisible(true);
    
      
      
      
      
      
    }
    
    
    
    public void actionPerformed(ActionEvent ae)
    {
    if (ae.getSource() == exit)
      {
          System.exit(0);
      }
    else if (ae.getSource()== deposit)
    {
      setVisible(false);
      new Deposit(pinnumber).setVisible(true);
      
    }
    else if (ae.getSource()== withdrawl)
    {
          setVisible(false);
         new Withdrawl(pinnumber).setVisible(true);

    }
    else if (ae.getSource() == fastcash)
    {
     setVisible(false);
      new FastCash(pinnumber).setVisible(true);
    
    }
    else if (ae.getSource() == pinchange)
    {
     setVisible(false);
      new PinChange(pinnumber).setVisible(true);
    
    }
    
    else if (ae.getSource() == balanceenquiry)
    {
     setVisible(false);
      new BalanceEnquiry(pinnumber).setVisible(true);
    
    }
    
    else if (ae.getSource() == ministatement)
    {
      new MiniStatement(pinnumber).setVisible(true);
    
    }
    
    
    
    }
    
     
    
    public static void main(String[] args)
    {
     new Transcctions("");
    }
    
}
