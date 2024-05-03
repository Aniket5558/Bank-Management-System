
package bank.management.system;

import java.sql.*;

public class Conn 

{
    Connection c;
    Statement s;
    
    public Conn(){
        try {
           c = DriverManager.getConnection("jdbc:mysql:///bs","root","5558");
           s = c.createStatement();
        } 
        
        catch (Exception e)
                { 
                    System.out.println(e); 
                }
        }
    
    public void closeConnection(){
       
        try {
            c.close();
        } catch (Exception e) {
        }
        
    }
  }
