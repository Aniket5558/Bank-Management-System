
package bank.management.system;

import javax.swing.*;

import java.awt.*;
import java.util.*;

import com.toedter.calendar.JDateChooser;
import java.awt.event.*;



public class SignupOne extends JFrame implements ActionListener
{
    
    
       long random;
       JTextField nameTextField ,fnameTextField,emailTextField , addressTextField , cityTextField, stateTextField,pinTextField  ;
       
       JButton next;
       
       JRadioButton male, female ,other,married, unmarried;
       
       JDateChooser DateChooser;
       
       
    
    SignupOne()
    {       
        setLayout(null);
        
        Random ran =new Random();
         random = Math.abs((ran.nextLong() % 9000L)  +1000L);
         System.out.println(random);
        
        
        JLabel formno = new JLabel("APPLICATION FORM NO.  "+ random);
        formno.setFont(new Font("Raleway", Font.BOLD, 38));
        formno.setBounds(160,20,600,40);
        add(formno);
        
        
        
        JLabel personDetails = new JLabel("Page 1: Personal Details");
        personDetails.setFont(new Font("Raleway", Font.BOLD, 20));
        personDetails.setBounds(270,70,400,30);
        add(personDetails);
        
        JLabel name = new JLabel("Name :");
        name.setFont(new Font("Raleway", Font.BOLD, 20));
        name.setBounds(100,150,100,30);
        add(name);
        
         nameTextField=new JTextField();
        nameTextField.setFont(new Font ("Raleway", Font.BOLD,14));
        nameTextField.setBounds(300, 150,400,30);
        add(nameTextField);
        
        
        
        JLabel fname = new JLabel("Father's Name :");
        fname.setFont(new Font("Raleway", Font.BOLD, 20));
        fname.setBounds(100,200,150,30);
        add(fname);
        
        fnameTextField= new JTextField();
        fnameTextField.setFont(new Font ("Raleway", Font.BOLD,14));
        fnameTextField.setBounds(300, 200,400,30);
        add(fnameTextField);
        
        JLabel dob = new JLabel("Date Of Birth :");
        dob.setFont(new Font("Raleway", Font.BOLD, 20));
        dob.setBounds(100,250,150,30);
        add(dob);
        
        DateChooser = new JDateChooser();
        DateChooser.setBounds(300,250,400,30);
        DateChooser.setForeground(new Color(150,150,150));
        add(DateChooser);
        
        
        JLabel gender = new JLabel("Gender :");
        gender.setFont(new Font("Raleway", Font.BOLD, 20));
        gender.setBounds(100,300,150,30);
        add(gender);
        
        
        male =  new JRadioButton("Male");
        male.setBounds(300,300,150,30);
        male.setBackground(Color.WHITE);
        add(male);
        
        female =  new JRadioButton("FeMale");
        female.setBounds(470,300,100,30);
        female.setBackground(Color.WHITE);
        add(female);

        other =  new JRadioButton("Other");
        other.setBounds(620,300,150,30);
        other.setBackground(Color.WHITE);
        add(other);
        
         
        
        
        
        ButtonGroup grnderGroup = new ButtonGroup();
        grnderGroup.add(male);
        grnderGroup.add(female);
        grnderGroup.add(other);
        
    
        
        
        JLabel email = new JLabel("Email Address :");
        email.setFont(new Font("Raleway", Font.BOLD, 20));
        email.setBounds(100,350,150,30);
        add(email);
        
        emailTextField= new JTextField();
        emailTextField.setFont(new Font ("Raleway", Font.BOLD,14));
        emailTextField.setBounds(300, 350,400,30);
        add(emailTextField);
       
       
        JLabel marital = new JLabel("Marital Status :");
        marital.setFont(new Font("Raleway", Font.BOLD, 20));
        marital.setBounds(100,400,150,30);
        add(marital);
        
        
        
        married =  new JRadioButton("Married");
        married.setBounds(300,400,150,30);
        married.setBackground(Color.WHITE);
        add(married);
        
        unmarried =  new JRadioButton("Unmarried");
        unmarried.setBounds(470,400,150,30);
        unmarried.setBackground(Color.WHITE);
        add(unmarried);
        
        
        
        ButtonGroup marry = new ButtonGroup();
        marry.add(married);
        marry.add(unmarried);
        
        
        JLabel address = new JLabel("Address :");
        address.setFont(new Font("Raleway", Font.BOLD, 20));
        address.setBounds(100,450,150,30);
        add(address);
        
        addressTextField= new JTextField();
        addressTextField.setFont(new Font ("Raleway", Font.BOLD,14));
        addressTextField.setBounds(300, 450,400,30);
        add(addressTextField);
       
        
        JLabel city = new JLabel("City :");
        city.setFont(new Font("Raleway", Font.BOLD, 20));
        city.setBounds(100,500,150,30);
        add(city);
        
        cityTextField= new JTextField();
        cityTextField.setFont(new Font ("Raleway", Font.BOLD,14));
        cityTextField.setBounds(300, 500,400,30);
        add(cityTextField);
        
        JLabel state = new JLabel("State:");
        state.setFont(new Font("Raleway", Font.BOLD, 20));
        state.setBounds(100,550,150,30);
        add(state);
        
        stateTextField= new JTextField();
        stateTextField.setFont(new Font ("Raleway", Font.BOLD,14));
        stateTextField.setBounds(300, 550,400,30);
        add(stateTextField);
        
        JLabel pincode = new JLabel("Pin Code:");
        pincode.setFont(new Font("Raleway", Font.BOLD, 20));
        pincode.setBounds(100,600,150,30);
        add(pincode);
        
        pinTextField= new JTextField();
        pinTextField.setFont(new Font ("Raleway", Font.BOLD,14));
        pinTextField.setBounds(300, 600,400,30);
        add(pinTextField);
        
        
        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font ("Raleway", Font.BOLD,14));
        next.setBounds(600,650,80,30);
        next.addActionListener(this);
        add(next);
        
        
        
        
        
        
        
        
        
        
       
        getContentPane().setBackground(Color.WHITE);
        
        
        setSize(800,840);
        setLocation(300,10);
        setVisible(true);
        
        
        
        
        
    
    
    } 
    
    
    
    public void actionPerformed(ActionEvent ae)
    {
     String formno = " " + random ;
     System.out.println("formno"+formno);
     System.out.println("formno"+random);
     String name = nameTextField.getText();
     String fname = nameTextField.getText();
     String dob =((JTextField) DateChooser.getDateEditor().getUiComponent()).getText();
     String gender = null;
     if(male.isSelected())
     {
         gender = "Male";
     
     }
     else if (female.isSelected())
     {
          gender = "Female";
     }
     
     String email = emailTextField.getText();
     String marital= null;
     if (married.isSelected())
     {
       marital = "Married";
     }
     else if (unmarried.isSelected())
     {
       marital = "Unmarried";
     }
     else if (other.isSelected())
     {
        marital = "Other";     
     }
     
     String address = addressTextField.getText();
     String city = cityTextField.getText();
     String state = stateTextField.getText();
     String pin = pinTextField.getText();
     
     
     
     try {
         if (name.equals(""))
                {
             
                  JOptionPane.showMessageDialog (null , "Name is Required");
         
                }
         else   {
                   Conn c = new Conn();
                   String query = "insert into signup values('"+formno+"', '"+name+"', '"+fname+"', '"+dob+"', '"+gender+"','"+email+"' ,'"+marital+"' ,'"+address+"' ,'"+city+"' ,'"+pin+"' ,'"+state+"')";
                      c.s.executeUpdate(query);
                      
                      setVisible(false);
                      new SignupTwo(formno).setVisible(true);
                 }
         
         
     }
         catch ( Exception e)
                 {
                   System.out.println(e);
                 }
     
      
     
    
     
    
    }
    
    public static void main(String args[])
    {
      new SignupOne();
        
    }
}