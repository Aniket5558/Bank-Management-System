 
package bank.management.system;

import javax.swing.*;

import java.awt.*;

import java.awt.event.*;



public class SignupTwo extends JFrame implements ActionListener
{
    
    
       
       JTextField pan , aadhar ;
       
       JButton next;
       
       JRadioButton syes, sno ,eyes,eno;
       
       
       JComboBox religion , category , occupation ,education,income;
       String formno;
    
    SignupTwo(String formno)
    {       
        this.formno =formno;
        setLayout(null);
        
       setTitle("NEW ACCOUNT APPLICATION FORM-PAGE 2");
        
        
        JLabel additionalDetails= new JLabel("Page 2: Additional Details");
        additionalDetails.setFont(new Font("Raleway", Font.BOLD, 20));
        additionalDetails.setBounds(270,70,400,30);
        add(additionalDetails);
        
        JLabel name = new JLabel("Religion :");
        name.setFont(new Font("Raleway", Font.BOLD, 20));
        name.setBounds(100,150,100,30);
        add(name);
        
        String valReligion[] ={"Hindu","Muslim","Sikh","Christian","Other"};
        religion = new JComboBox(valReligion);
        religion.setBounds(300, 150,400,30);
        religion.setBackground(Color.WHITE);
        add(religion);
        
          
        JLabel fname = new JLabel("Category:");
        fname.setFont(new Font("Raleway", Font.BOLD, 20));
        fname.setBounds(100,200,150,30);
        add(fname);
          
        
        String Valcategory[] ={"General","OBC","SC","ST","Other"};
        category = new JComboBox(Valcategory);
        category.setBounds(300, 200,400,30);
        category.setBackground(Color.WHITE);
        add(category);
        
        JLabel dob = new JLabel("Income :");
        dob.setFont(new Font("Raleway", Font.BOLD, 20));
        dob.setBounds(100,250,150,30);
        add(dob);
        
        String Valincome[] ={"Null","<1,50,000","<2,50,000","<5,00,000","Upto 10,00,000"};
        income = new JComboBox(Valincome);
        income.setBounds(300, 250,400,30);
        income.setBackground(Color.WHITE);
        add(income);
        
        
        JLabel gender = new JLabel("Eaducational ");
        gender.setFont(new Font("Raleway", Font.BOLD, 20));
        gender.setBounds(100,300,150,30);
        add(gender);
        
        
        JLabel email = new JLabel("Qualification :");
        email.setFont(new Font("Raleway", Font.BOLD, 20));
        email.setBounds(100,340,150,30);
        add(email);
        
        
        String educationvalues[] ={"Non Gradution","Gradution","Post-Gradution","Doctraet","Other"};
        education = new JComboBox(educationvalues);
        education.setBounds(300, 340,400,30);
        education.setBackground(Color.WHITE);
        add(education);
        
        
        JLabel marital = new JLabel("Occupation :");
        marital.setFont(new Font("Raleway", Font.BOLD, 20));
        marital.setBounds(100,400,150,30);
        add(marital);
        
        String occupationvalues[] ={"Salaried","Self Employed","Bussiness","Retired","Other"};
        occupation = new JComboBox(occupationvalues);
        occupation.setBounds(300, 400,400,30);
        occupation.setBackground(Color.WHITE);
        add(occupation);
        
        
        
        JLabel address = new JLabel("PAN Number :");
        address.setFont(new Font("Raleway", Font.BOLD, 20));
        address.setBounds(100,450,150,30);
        add(address);
        
        pan= new JTextField();
        pan.setFont(new Font ("Raleway", Font.BOLD,14));
        pan.setBounds(300, 450,400,30);
        add(pan);
       
        
        JLabel city = new JLabel("Aadhar No. :");
        city.setFont(new Font("Raleway", Font.BOLD, 20));
        city.setBounds(100,500,150,30);
        add(city);
        
        aadhar= new JTextField();
        aadhar.setFont(new Font ("Raleway", Font.BOLD,14));
        aadhar.setBounds(300, 500,400,30);
        add(aadhar);
        
        JLabel state = new JLabel("Senior Citizion:");
        state.setFont(new Font("Raleway", Font.BOLD, 20));
        state.setBounds(100,550,150,30);
        add(state);
        
        
       syes =  new JRadioButton("Yes");
        syes.setBounds(300,550,150,30);
        syes.setBackground(Color.WHITE);
        add(syes);
        
        sno =  new JRadioButton("No");
        sno.setBounds(470,550,150,30);
        sno.setBackground(Color.WHITE);
        add(sno);
        
        ButtonGroup marry = new ButtonGroup();
        marry.add(syes);
        marry.add(sno);
       
        
        
        JLabel pincode = new JLabel("Exisiting Account:");
        pincode.setFont(new Font("Raleway", Font.BOLD, 20));
        pincode.setBounds(100,600,190,30);
        add(pincode);
        
        eyes =  new JRadioButton("Yes");
        eyes.setBounds(300,600,150,30);
        eyes.setBackground(Color.WHITE);
        add(eyes);
        
        eno =  new JRadioButton("No");
        eno.setBounds(470,600,150,30);
        eno.setBackground(Color.WHITE);
        add(eno);
        
        ButtonGroup ampmarry = new ButtonGroup();
        ampmarry.add(eyes);
        ampmarry.add(eno);
       
        
        
        
        
        
       
        
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
     
     String sreligion = (String)religion.getSelectedItem();
     String scategory = (String)category.getSelectedItem();
     String sincome =(String)income.getSelectedItem();
     String seducation =(String)education.getSelectedItem();
     String soccupation =(String)occupation.getSelectedItem();
     
     String seniorcitizen = null;
     if(syes.isSelected())
     {
         seniorcitizen = "Yes";
     
     }
     else if (sno.isSelected())
     {
          seniorcitizen = "No";
     }
     
     String exisitionaccount = null;
     if (eyes.isSelected())
     {
       exisitionaccount = "Yes";
     }
     else if (eno.isSelected())
     {
       exisitionaccount = "No";
     }
        
    
      
      String span = pan.getText();
       String saadhar = aadhar.getText();
      
     
     
        try {
                   Conn c = new Conn();
                   String query = "insert into signuptwo values('"+formno+"', '"+sreligion+"', '"+scategory+"', '"+sincome+"', '"+seducation+"','"+soccupation+"' ,'"+span+"' ,'"+saadhar+"' ,'"+seniorcitizen+"' ,'"+exisitionaccount+"')";
                   c.s.executeUpdate(query);
                   
                   
                   setVisible(false);
                   new SignupThree(formno).setVisible(true);
          }
         
             catch ( Exception e)
                 {
                   System.out.println(e);
                 }
    
    }
    
    public static void main(String args[])
    {
      new SignupTwo("");
        
    }
}