
package bank.management.system;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;



public class SignupThree extends JFrame implements ActionListener{    
    JRadioButton r1,r2,r3,r4;    
    JCheckBox c1,c2,c3,c4,c5,c6,c7;
    JButton submit,cancel;
    String formno;
        SignupThree(String formno)
    {   
        this.formno = formno;
        setLayout(null);


       JLabel l1= new JLabel("Page 3 : Account Details");
       l1.setFont(new Font("Raleway", Font.BOLD, 22));      
       l1.setBounds(280,30,500,50);
       add(l1);       
              
        JLabel type= new JLabel("Account Type :");   
       type.setFont(new Font("Raleway", Font.BOLD, 22));
       type.setBounds(100,100,200,30);       
       add(type);
              
        r1 = new JRadioButton("Saving Account");       
        r1.setFont(new Font("Raleway", Font.BOLD, 16));
        r1.setBackground(Color.WHITE);        
        r1.setBounds(290,100,160,30);
        add(r1);

         r2 = new JRadioButton("Fixed Deposit Account");        
         r2.setFont(new Font("Raleway", Font.BOLD, 16));
        r2.setBackground(Color.WHITE);        
        r2.setBounds(480,100,200,30);
        add(r2);      

        r3 = new JRadioButton("Current Account");
        r3.setFont(new Font("Raleway", Font.BOLD, 16));      
        r3.setBackground(Color.WHITE);
        r3.setBounds(290,170,160,30);       
        add(r3);

        r4 = new JRadioButton("Recurring Deposit Account");
        r4.setFont(new Font("Raleway", Font.BOLD, 16));        
        r4.setBackground(Color.WHITE);
        r4.setBounds(480,170,250,30);        
        add(r4);


        ButtonGroup groupgender = new ButtonGroup();
        groupgender.add(r1);
        groupgender.add(r2);       
        groupgender.add(r3);
        groupgender.add(r4);        
                
        JLabel card= new JLabel("Card Number : ");       
        card.setFont(new Font("Raleway", Font.BOLD, 22));
       card.setBounds(100,260,200,30);       
       add(card);
              
               JLabel number= new JLabel("XXXX-XXXX-XXXX-5558");
       number.setFont(new Font("Raleway", Font.BOLD, 22));       
       number.setBounds(350,260,280,30);
       add(number);       
              JLabel details= new JLabel("Your 16-digit Card number");
       details.setFont(new Font("Raleway", Font.BOLD, 13));      
       details.setBounds(100,290,280,30);
       add(details);       
              
               JLabel pin= new JLabel("PIN : ");
       pin.setFont(new Font("Raleway", Font.BOLD, 22));
       pin.setBounds(100,340,200,30);       
       add(pin);
       
      JLabel pdetails= new JLabel("4-digit password");
       pdetails.setFont(new Font("Raleway", Font.BOLD, 13));       
       pdetails.setBounds(100,370,280,30);
       add(pdetails); 
       
       
               JLabel pnumber= new JLabel("XXXX");
       pnumber.setFont(new Font("Raleway", Font.BOLD, 22));       
       pnumber.setBounds(420,340,80,30);
       add(pnumber);     

       JLabel services= new JLabel("Services Required :");       
       services.setFont(new Font("Raleway", Font.BOLD, 25));
       services.setBounds(100,410,250,30);       
       add(services);
              
              
              
        c1= new JCheckBox("ATM CARD");        
        c1.setBackground(Color.WHITE);
        c1.setFont(new Font("Raleway", Font.BOLD, 16));       
        c1.setBounds(120,470,230,30);
        add(c1);  



        c2 = new JCheckBox("Internet Banking");
        c2.setBackground(Color.WHITE);       
        c2.setFont(new Font("Raleway", Font.BOLD, 16));
        c2.setBounds(430,470,230,30);        
        add(c2);
                
        
        c3 = new JCheckBox("Mobile Banking");
        c3.setBackground(Color.WHITE);
        c3.setFont(new Font("Raleway", Font.BOLD, 16));
        c3.setBounds(120,520,230,30);
        add(c3);
        
        c4 = new JCheckBox("EMAIL Alerts");
        c4.setBackground(Color.WHITE);
        c4.setFont(new Font("Raleway", Font.BOLD, 16));
        c4.setBounds(430,520,230,30);
        add(c4);
        
         c5 = new JCheckBox("Cheque Book");
        c5.setBackground(Color.WHITE);
        c5.setFont(new Font("Raleway", Font.BOLD, 16));
        c5.setBounds(120,570,230,30);
        add(c5);

         
        c6 = new JCheckBox("E-Statement");
        c6.setBackground(Color.WHITE);
        c6.setFont(new Font("Raleway", Font.BOLD, 16));
        c6.setBounds(430,570,230,30);
         add(c6); 
       
         c7 = new JCheckBox("I hereby declares that the above entered details correct to th best of my knowledge.",true);
         c7.setBackground(Color.WHITE);
         c7.setFont(new Font("Raleway", Font.BOLD, 12));
         c7.setBounds(120,610,500,30);
         add(c7); 
       

         submit = new JButton("Submit");
         submit.setBackground(Color.BLACK);
         submit.setForeground(Color.WHITE);
         submit.setFont(new Font("Raleway", Font.BOLD, 14));
         submit.setBounds(140,660,150,30);
         submit.addActionListener(this);
         add(submit); 

         cancel = new JButton("Cancel");
         cancel.setBackground(Color.BLACK);
         cancel.setForeground(Color.WHITE);
         cancel.setFont(new Font("Raleway", Font.BOLD, 14));
         cancel.setBounds(420,660,150,30);
         cancel.addActionListener(this);
        add(cancel); 
       
          

         getContentPane().setBackground(Color.WHITE);
          
         
                
              
       setSize(750,820);
       setLocation(350,0);      
       setVisible(true);
      }


        public void actionPerformed(ActionEvent ae){
        if (ae.getSource()== submit) {
            
        String accountType =null;
        if(r1.isSelected()){ 
            accountType = "Saving Account";
        }
        else if(r2.isSelected()){ 
            accountType = "Fixed Deposit Account";
        }
        else if(r3.isSelected()){ 
            accountType = "Current Account";
        }else if(r4.isSelected()){ 
            accountType = "Recurring Deposit Account";
        }
        
        Random random = new Random();
        String cardnumber = "" + Math.abs((random.nextLong() % 90000000L)+ 50409360000000L);
        String pinnumber = "" + Math.abs((random.nextLong() %9000L)+  1000L);
        
        
       
        String facility = "";
        if(c1.isSelected()){ 
            facility = facility + " ATM Card";
        }
        if(c2.isSelected()){ 
            facility = facility + " Internet Banking";
        }
        if(c3.isSelected()){ 
            facility = facility + " Mobile Banking";
        }
        if(c4.isSelected()){ 
            facility = facility + " EMAIL Alerts";
        }
        if(c5.isSelected()){ 
            facility = facility + " Cheque Book";
        }
        if(c6.isSelected()){ 
            facility = facility + " E-Statement";
        }
        
        try{
            
            
            {
                Conn conn =new Conn();
                String query1 ="insert into signupthree values('"+ formno +"','"+ accountType +"','"+ cardnumber +"','"+ pinnumber +"','"+facility+"')";
                String query2 ="insert into login values('"+ formno +"','"+ cardnumber +"','"+ pinnumber +"')";
                 
                conn.s.executeUpdate(query1);
                conn.s.executeUpdate(query2);
             
                JOptionPane.showMessageDialog(null,"card Number : " + cardnumber +"\n  Pin : "+  pinnumber);
           
                setVisible(false);
      new Deposit(pinnumber).setVisible(false);
      
            
            }
            
        }
        catch(Exception e){
                
          System.out.println(e);
            
             }
        }
        
        
           else if ( ae.getSource()== cancel )
        {
                   setVisible(false);
                 new Login().setVisible(true);
      
        }
        }
        
        public static void main(String args[])
    {        
      new SignupThree("");
    } 
}
